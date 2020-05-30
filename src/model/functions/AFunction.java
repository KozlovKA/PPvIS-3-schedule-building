package com.company.model.functions;

import com.company.model.Function;

public class AFunction extends Function {
    public AFunction(int topValue, int bottomValue, int nParam) {
        super(topValue, bottomValue, nParam);
    }

    @Override
    public double calculateY(double x) {
        return x - 3;
    }
}
