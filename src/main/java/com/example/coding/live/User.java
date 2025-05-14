package com.example.coding.live;

public class User {

    public String answer(String number, Integer errRate) {
        if (getErrorRate() < errRate) {
            return "ERROR";
        } else {
            return String.valueOf(number);
        }
    }

    private int getErrorRate() {
        return (int) (Math.random() * 100) + 1;
    }
}
