package com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.test;

import com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.service.StoreService;
import com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;


public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);

    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated) {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10, runnable -> {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        });

        List<String> stores = List.of("Store 1","Store 2", "Store 3","Store 4");

        List<CompletableFuture<Double>> collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPriceSync(s), executorService))
                .collect(Collectors.toList());

        List<Double> prices = collect.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);

        long end = System.currentTimeMillis();
        executorService.shutdown();
        System.out.printf("Time passed to searchPriceSync %dms%n", end - start);
        //StoreService.shutdown();
    }
}
