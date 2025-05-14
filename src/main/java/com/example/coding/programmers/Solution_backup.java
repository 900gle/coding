//package com.example.coding.programmers;
//
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//class Test {
//
//    public static void main(String[] args) {
//
//        Solution sol = new Solution();
//        String[] logs = {
//                "team_name : t application_name : a error_level : e message : m",
//                "team_name : t application_name : a error_level : e message : m2",
//                "team_name : t application_name : a error_level : e message : ma n"
//        };
//
//
//        int result = sol.solution(logs);
//
//        System.out.println(result);
//
//    }
//
//
//}
//public class Solution {
//
//    private int invalidLogsCount = 0;
//
//    public int solution(String[] logs) {
//        String[] requiredFields = {"team_name", "application_name", "error_level", "message"};
//        for (String log : logs) {
//
//            boolean isValidLog = true;
//            for (String field : requiredFields) {
//                if (!log.contains(field + " :")) {
//                    invalidLogsCount++;
//                    isValidLog = false;
//                    break;
//                }
//            }
//            if (isValidLog) {
//                for (String field : requiredFields) {
//                    extractFieldValue(field, log);
//                }
//            }
//        }
//
//        return invalidLogsCount;
//    }
//
//    public void extractFieldValue(String field, String log) {
//        Pattern pattern = Pattern.compile(field + " :\\s*([^\\s]+)");
//        Matcher matcher = pattern.matcher(log);
//        if (matcher.find()) {
//            String fieldValue = matcher.group(1);
//            if (!fieldValue.matches("[a-zA-Z]+") || fieldValue.contains(" ")) {
//                invalidLogsCount++;
//            }
//        } else {
//            invalidLogsCount++;
//        }
//    }
//
//}
