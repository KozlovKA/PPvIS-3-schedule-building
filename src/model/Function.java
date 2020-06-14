package com.company.model;

import java.util.LinkedList;
import java.util.List;

public abstract class Function {
    private final double step = 0.01;
    protected int nParam;
    double[] Xes;
    double[] Yes;
    int topValue;
    int bottomValue;

    public Function(int topValue, int bottomValue, int nParam) {
        this.topValue = topValue;
        this.bottomValue = bottomValue;
        this.nParam = nParam;
        List<Double> xes = new LinkedList<>();
        List<Double> yes = new LinkedList<>();
        for (double i = bottomValue; i < topValue; i += step) {
            xes.add(i);
            yes.add(calculateY(i));
        }
        Xes = new double[xes.size()];
        Yes = new double[yes.size()];
        for (int i = 0; i < xes.size(); i++) {
            Xes[i] = xes.get(i);
            Yes[i] = yes.get(i);
        }
    }

    public abstract double calculateY(double x);

    public double[] getXes() {
        return Xes;
    }

    public double[] getYes() {
        return Yes;
    }
}
