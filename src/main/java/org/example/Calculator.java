package org.example;

public class Calculator implements ICalculator{
    @Override
    public Integer sum(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a-b;
    }
}
