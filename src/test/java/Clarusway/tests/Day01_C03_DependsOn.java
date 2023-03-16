package Clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C03_DependsOn {
    //Home page testimiz login testimize bagli oldugundan dependsOn attribute unu kullanabiliriz.
    //Bagımli olunan test fail olursa bagimli olan method ignore edilir
    // Bagimli olan method alfabetik execution a bakilmaksizin bagimli olunan metoddan sonra calisir
    // Coklu dependsOn kullaniminda tum bagimli olunan methodlar pass oldugu durumda bagimli method calisir
    @Test
    public void loginTest(){
        System.out.println("Login testi yapiliyor");
    }
    @Test
    public void registrationTest(){

    }
    @Test(dependsOnMethods = {"loginTest","registrationTest"})
    public void homePageTest(){
        System.out.println("Home Page Testi yapiliyor");
    }
}
