package com.example.coding.testdome;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.regex.Pattern;
/*
Write a function that provides change directory (cd) function for an abstract file system.

        Notes:
        - Root path is '/'.
        - Path separator is '/'.
        - Parent directory is addressable as "..".
        - Directory names consist only of English alphabet letters (A-Z and a-z).

        For example, new Path("/a/b/c/d").cd("../x").getPath() should return "/a/b/c/x".
*/


public class Path {

    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public Path cd(String newPath) {

        if (Pattern.matches("^[a-zA-Z]*$", newPath)) {
            return this;
        }


        if (newPath == "" ) {
            return this;
        }
        String[] folder = this.path.split("/");
        String[] paths = newPath.split("../");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < folder.length - (paths.length - 1); i++) {
            stringBuilder.append(folder[i]);
            stringBuilder.append("/");
        }

        stringBuilder.append(paths[paths.length - 1]);

        this.path = stringBuilder.toString();
        return this;
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath());
    }
}
