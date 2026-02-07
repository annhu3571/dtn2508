package com.vti.dtn2508.bt09;

public class MyMath <T extends  Number> {
    private T number;

    public double sum(T... numbers) {
        double sum = 0;
        for (T t: numbers) {
            sum += t.doubleValue();
        }
        return sum;
    }
}
