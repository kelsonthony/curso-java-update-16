package com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.test;

import com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        //searchPriceWithDiscount(service);
        searchPriceWithDiscountAsync(service);
    }

    private static void searchPriceWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        var completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b%n", voidCompletableFuture.isDone());

//        CompletableFuture<Object> objectCompletableFuture = CompletableFuture.anyOf(completableFutures);
//        objectCompletableFuture.join();
//        System.out.printf("Finished? %b%n", objectCompletableFuture.isDone());


        long end = System.currentTimeMillis();

        System.out.printf("Time passed to searchPriceSync %dms%n", end - start);
    }
}
