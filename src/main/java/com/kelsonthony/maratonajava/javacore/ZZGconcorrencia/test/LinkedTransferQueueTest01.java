package com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.Objects;
import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentLinkedQueue SyncConcurrentLinkedQueue LinkedBlockingQueue
        TransferQueue<Object> objects = new LinkedTransferQueue<>();
        System.out.println(objects.add("Kelson"));
        System.out.println(objects.offer("Kelson"));
        System.out.println(objects.offer("Kelson", 10, TimeUnit.SECONDS));
        objects.put("Teste");
        //objects.transfer("Transferencia");
        if (objects.hasWaitingConsumer()) {
            objects.transfer("Transferencia");
        }

        System.out.println(objects.tryTransfer("Academia"));
        System.out.println(objects.tryTransfer("Academia", 5, TimeUnit.SECONDS));
        System.out.println(objects.peek());
        System.out.println(objects.poll());
        System.out.println(objects.remove());
        System.out.println(objects.take());
        System.out.println(objects.remainingCapacity());

    }
}
