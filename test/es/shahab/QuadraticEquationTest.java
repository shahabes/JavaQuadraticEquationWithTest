package es.shahab;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testng.annotations.BeforeTest;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class QuadraticEquationTest {

    QuadraticEquation equation;

    @BeforeAll
    void init() {
        equation = new QuadraticEquation(0, 0, 0);
    }

    @Test
    void solveWithNoRoots() {
        equation.setA(1);
        equation.setB(4);
        equation.setC(5);

        assertNull(equation.solve());
    }

    @Test
    void solveWithOneRoot() {
        equation.setA(1);
        equation.setB(2);
        equation.setC(1);

        var roots = equation.solve();
        assertTrue((roots.get(0) == -1) && (roots.get(1) == -1));
    }

    @Test
    void solveWithTwoRoots() {
        equation.setA(1);
        equation.setB(-8);
        equation.setC(15);

        var roots = equation.solve();
        assertTrue(roots.contains((double) 3) && roots.contains((double) 5));
    }
}