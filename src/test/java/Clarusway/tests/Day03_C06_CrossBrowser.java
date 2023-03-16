package Clarusway.tests;

import Clarusway.utilites.BaseCrossBrowserTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {
    //browser bilgisi testng.xml dosyasından alınacagından dolayı kod asamasında herhangi bir degişiklik görüntulenmeyecektir

    @Test
    public void crossBrowserTest(){
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(),"Google");

    }
}
