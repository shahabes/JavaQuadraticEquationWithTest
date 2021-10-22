package es.shahab;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation {
    private int b;
    private int c;
    private int a;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public List<Double> solve() {
        int delta = deltaCalculator();

        if (delta < 0)
            return null;

        double firstRoot;
        double secondRoot;

        if (delta == 0) {
            firstRoot = secondRoot = ((-b) + Math.sqrt(delta)) / (2 * a);

        } else {
            firstRoot = ((-b) + Math.sqrt(delta)) / (2 * a);
            secondRoot = ((-b) - Math.sqrt(delta)) / (2 * a);

        }

        List<Double> result = new ArrayList<>();
        result.add(firstRoot);
        result.add(secondRoot);

        return result;
    }

    private int deltaCalculator() {
        return (b * b) - (4 * a * c);
    }
}
