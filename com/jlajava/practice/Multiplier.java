package com.jlajava.practice;

public class Multiplier extends CalculateBase {
    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
    
}
