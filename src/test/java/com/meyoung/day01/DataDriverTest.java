package com.meyoung.day01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverTest {
    @DataProvider(name="loginUser")
    public Object[][] data1(){
        return new Object[][]{{"user1","pwd1"},
                              {"user2","pwd2"}};
    }
    @Test(dataProvider="loginUser")
    public void loginTest(String user,String pwd){
        System.out.println("User"+user);
        System.out.println("User"+pwd);
    }



}