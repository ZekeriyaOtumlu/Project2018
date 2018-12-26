package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo emp = new EmployeeInfo("Victoria",201, "NewYork", 3000 );

        Assert.assertEquals(3000,emp.population());
        Assert.assertEquals(85000,emp.calculateSalary());
        Assert.assertEquals("i will call you",emp.job());
        Assert.assertEquals(101000,emp.calculateEmployeePension());
        Assert.assertEquals((double) 13000,emp.calculateEmployeeBonus());
        Assert.assertEquals(2250.0,emp.crowdedCity());
        Assert.assertEquals("Im tired",emp.function());

    }
}