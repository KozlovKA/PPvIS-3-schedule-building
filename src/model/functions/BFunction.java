package com.company.model.functions;

import com.company.model.Function;
import org.apache.commons.math3.*;
import org.apache.commons.math3.util.ArithmeticUtils;

public class BFunction extends Function {

    public BFunction(int topValue, int bottomValue, int nParam) {
        super(topValue, bottomValue, nParam);
    }

    @Override
    public double calculateY(double x) {
        double result = 0.0;
        x = x * (-1);
        for (int k = 1; k < nParam; k++) {
            double iterationRes = (1.0 / ArithmeticUtils.factorial(nParam)) * (Math.pow(-1,k) + Math.pow(x, k)) /
                    (ArithmeticUtils.factorial((int) ArithmeticUtils.factorial(k) + 1));
            result = result + iterationRes;
        }
        return result;
    }
}