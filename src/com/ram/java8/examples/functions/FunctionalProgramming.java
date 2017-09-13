package com.ram.java8.examples.functions;

import java.util.function.Function;

public class FunctionalProgramming {

    // Function<Integer, Integer> add1 =  x -> x+1;

    public static Function<Integer, Integer> add1(Integer x) {
        return y -> x + 1;
    }

    public static void main(String[] args) {
        System.out.println(add1(1000).apply(1));
    }


}
