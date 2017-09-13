package com.ram.java8.examples;

import java.lang.annotation.Annotation;

public abstract class TestImpl implements Test {
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }


    public abstract void lemmedothis();

    public abstract int returnMe();

}
