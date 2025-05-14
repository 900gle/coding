package com.example.coding.live;

public class TSNGameFactory {


    public static User getUser(TSNGameFactoryInterface tsnGameFactoryInterface) {
        return tsnGameFactoryInterface.getUser();
    }

    public static TSNGame getTSNGame(TSNGameFactoryInterface tsnGameFactoryInterface) {
        return tsnGameFactoryInterface.getTSNGame();
    }
}
