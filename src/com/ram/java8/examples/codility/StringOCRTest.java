package com.ram.java8.examples.codility;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class StringOCRTest {
    public boolean Solution(String S, String T) {
        boolean isOCRmatch = false;
        if (S.equals(T)) {
            isOCRmatch= true;
        } else if(S.length() != T.length()) {
            isOCRmatch=  false;
        }
        int count = S.length() - S.replace("?", "").length();
        if (S.contains("?") && T.contains("?")) {
            for(int i=0;i<S.length();i++) {
                char l = S.charAt(S.indexOf("?") - 1);
                char r = T.charAt((T.indexOf("?") + 1));

                if(l != r && l !='?' && r != '?') {
                    isOCRmatch = false;
                }
            }
        }
        isOCRmatch = true;

        return isOCRmatch;
    }
}