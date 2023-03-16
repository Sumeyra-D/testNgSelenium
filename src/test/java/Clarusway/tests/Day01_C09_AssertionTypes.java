package Clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_C09_AssertionTypes {
    @Test
    public void hardAssertion(){
        System.out.println("Assertion oncesi calisiyor");
        Assert.assertEquals(1,2);
        System.out.println("Assertion sonrasi calisiyor");
    }
    @Test
    public void softAssertion(){
        System.out.println("Soft Assertion oncesi calisiyor");
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(1,2);//Fail
        softAssert.assertTrue(true);//pass

        System.out.println("Soft Assertion sonrasi calişiyor");

        softAssert.assertAll();//Method sonunda kesinlikle cagirilmali
    }
}
