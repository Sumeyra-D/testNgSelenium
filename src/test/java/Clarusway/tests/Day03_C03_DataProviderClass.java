package Clarusway.tests;

import org.testng.annotations.DataProvider;

public class Day03_C03_DataProviderClass {

    @DataProvider(name="testData")
    public Object[][] data(){
        Object[][] returnData ={
                {"First test","Birinci test"},
                {"Second test", "ikinci test"},
                {"Third test","ucuncu test"}
        };
        return returnData;
    }
}
