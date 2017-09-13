package com.ram.java8.examples.codility;


// you can also use imports, for example:
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        if(A == null || A.length ==0)
            return -1;

        int  max=A[0], j=0;
        for (int i = 0; i <A.length-1;i++)
        {
            j=i+1;
            if (A[j] >A[i]) {
                max += A[j] - A[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[] {1,3,2,1,2,1,5,3,3,4,2}));
        System.out.println(s.solution(new int[] {2,1,5,2,6,8,10,15}));
        System.out.println(s.solution(new int[] {4,8}));
        System.out.println(s.solution(new int[] {1,1,1,1}));

    }

}
