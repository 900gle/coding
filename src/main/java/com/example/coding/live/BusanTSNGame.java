package com.example.coding.live;

public class BusanTSNGame extends TSNGame {


    public String play(int number){
        char[] charArray = String.valueOf(number).toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : charArray) {
            if (c == '3' || c == '6' || c == '9') {
                builder.append("clap");
            }
        }
        if (builder.length() > 0) {
            return builder.toString();
        } else {
            return String.valueOf(number);
        }
    }


}
