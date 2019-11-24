package com.devops.workshop;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {

    private final Calculator calculator = new Calculator();

    @Test
    public void sum() {
        final int sum = calculator.sum(1, 1);
        Assert.assertEquals(sum, 2);
    }

    @Test
    public void multiply() {
        final int product = calculator.multiply(2, 3);
        Assert.assertEquals(product, 6);
    }

}
