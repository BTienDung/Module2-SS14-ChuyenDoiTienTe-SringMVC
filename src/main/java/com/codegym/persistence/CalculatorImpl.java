package com.codegym.persistence;

public class CalculatorImpl implements  GeneralCalculator {

    @Override
    public float conver(Float usd) {
        return usd*23000;
    }
}
