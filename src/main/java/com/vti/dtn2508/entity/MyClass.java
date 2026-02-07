package com.vti.dtn2508.entity;

public class MyClass <T extends Number> {
    private T id;
    private String name;

    public int test() {
        return  id.intValue() -100;
    }
}
