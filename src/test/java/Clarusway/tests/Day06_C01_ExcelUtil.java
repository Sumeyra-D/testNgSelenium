package Clarusway.tests;

import Clarusway.utilites.BaseCrossBrowserTest;
import Clarusway.utilites.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day06_C01_ExcelUtil extends BaseCrossBrowserTest {
    /*
    Go to URL: http://crossbrowsertesting.github.io/login-form.html
Login with credentials by using ExcelUtils
Username: tester@crossbrowsertesting.com
Password: test123
     */

    @Test
    public void test(){
        String path="C:\\Users\\HUAWEI\\IdeaProjects\\CWTestNGSelenium\\src\\test\\java\\Clarusway\\resources\\testdata.xlsx";
        //   String path = System.getProperty("user.dir") + "\\src\\test\\java\\Clarusway\\resources\\testdata.xlsx";

        ExcelUtils eu=new ExcelUtils(path,2);
        driver.get("http://crossbrowsertesting.github.io/login-form.html");

        String email=eu.getCellData(1,0);
        String  password=eu.getCellData(1,1);

        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement welcome =driver.findElement(By.xpath("//h2[contains(.,'Welcome')]"));
        wait.until(ExpectedConditions.visibilityOf(welcome));

        Assert.assertTrue(welcome.getText().contains(email));



    }
}
