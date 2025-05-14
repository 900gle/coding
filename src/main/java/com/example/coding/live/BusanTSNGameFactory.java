package com.example.coding.live;

public class BusanTSNGameFactory implements TSNGameFactoryInterface{

    @Override
    public User getUser() {
        return new User();
    }

    @Override
    public TSNGame getTSNGame() {
        return new BusanTSNGame();
    }
}
