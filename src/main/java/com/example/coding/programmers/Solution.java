package com.example.coding.programmers;


import java.util.*;

class Test {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int n = 42;

        int result = sol.solution(n);

        System.out.println(result);

    }


}

public class Solution {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int size = 0;
        int max = -1;
        for(char c : binary.toCharArray()) {
            if (c == '1') {
                if(max < size){
                    max = size;
                }
                size =0;

            } else if (size != -1) {
                size++;
            }
        }
        return size;
    }
}
