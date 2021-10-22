package es.shahab;

public class Main {

    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = 3;

        var quadraticResult = new QuadraticEquation(a, b, c).solve();

        if(quadraticResult == null)
            System.out.println("The equation has no real root.");
        else
            System.out.printf("The roots are %s and %s.%n", quadraticResult.get(0),quadraticResult.get(1));


    }
}
