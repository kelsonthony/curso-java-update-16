package com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.test;

import com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService service = new StoreService();

        searchPricesAsyncCompletableFuture(service);

    }

    private static void searchPricesAsyncCompletableFuture(StoreService service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1","Store 2", "Store 3","Store 4");

//        List<Double> prices = stores.stream()
//                .map(service::getPricesAsyncCompletableFuture)
//                .map(CompletableFuture::join)
//                .collect(Collectors.toList());
        List<CompletableFuture<Double>> collect = stores.stream()
                .map(service::getPricesAsyncCompletableFuture)
                .collect(Collectors.toList());

        List<Double> prices = collect.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", end - start);
        //StoreService.shutdown();
    }
}
