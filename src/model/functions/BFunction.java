package com.company.model.functions;

import com.company.model.Function;

public class BFunction extends Function {

    public BFunction(int topValue, int bottomValue, int aParam) {
        super(topValue, bottomValue, aParam);
    }

    @Override
    public double calculateY(double x) {
        return  (aParam*x*2 / Math.pow(Math.E, Math.pow(x, 4)));
    }
}