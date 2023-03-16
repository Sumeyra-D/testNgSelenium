package Clarusway.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Day05_C02_ITestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTeststart methodu calisti");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess methodu calişti");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure methodu calişti");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(" onTestSkipped methodu calişti");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage methodu calişti");

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout methodu calişti");

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart methodu calişti");

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish methodu calişti");

    }
}
