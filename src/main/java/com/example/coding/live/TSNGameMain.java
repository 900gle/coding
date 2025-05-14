package com.example.coding.live;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

public class TSNGameMain {
    public static void main(String[] args) {

        int n = 100;
        User seoulUser = TSNGameFactory.getUser(new SeoulTSNGameFactory());
        TSNGame seoulGame = TSNGameFactory.getTSNGame(new SeoulTSNGameFactory());

        User busanUser = TSNGameFactory.getUser(new BusanTSNGameFactory());
        TSNGame busanGame = TSNGameFactory.getTSNGame(new BusanTSNGameFactory());

        AtomicInteger count = new AtomicInteger(0);

        CompletableFuture<Void> seoulFuture = CompletableFuture.runAsync(() -> {
            for (int i = 1; i <= n; i++) {
                if (seoulGame.play(i).equals(seoulUser.answer(seoulGame.play(i), 10))) {
                    System.out.println(seoulGame.play(i));
                    count.incrementAndGet();
                } else {
                    System.out.println("seoul Game Over");
                    break;
                }
            }
        });

        CompletableFuture<Void> busanFuture = CompletableFuture.runAsync(() -> {
            for (int i = 1; i <= n; i++) {

                if (busanGame.play(i).equals(busanUser.answer(busanGame.play(i), 10))) {
                    System.out.println(busanGame.play(i));
                    count.incrementAndGet();
                } else {
                    System.out.println("busan Game Over");
                    break;
                }
            }
        });

        CompletableFuture.allOf(seoulFuture, busanFuture).join();

        System.out.println("total: "+count);
    }

}
