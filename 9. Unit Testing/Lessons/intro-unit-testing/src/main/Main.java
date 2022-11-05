package src.main;

public class Main {
    
    static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};

    public static void main(String[] args) {   


    }

    public static double getSubtotal() {
        double temp = 0;
        for (int i = 0; i < prices.length; i++) {
            temp += prices[i];
        }
        return temp;
    }

}

/**
 * Test Drive Development: writing tests BEFORE writing code. Good code is easy to test. 
 * Bad Design - code isn't modular (performs too many tasks).
 * Not Modular = hard to test, vulnerable to bugs, hard to understand, not scalable.
 * Test Driven Development (TDD) helps achieve a modular design. 
 * Test Driven Development:
 * 1. Identify meaningful test cases.
 * 2. Write a unit test for each case.
 *  - write a test that fails.
 *  - make the test pass.
 *  - refactor if necessary
 * 
 */