package math.problems;

import org.testng.Assert;

import static math.problems.Factorial.factorial;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Assert.assertEquals(false,PrimeNumber.isPrime(10));
        Assert.assertEquals(120, factorial(5));
        Assert.assertEquals(9, 9);


    }
}
