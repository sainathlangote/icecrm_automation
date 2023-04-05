
package com.icecrm_automation.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icecrm_automation.utility.ExcelUtil;

public class ExcelTest {

    @DataProvider
    public Object [][]  getTestData(){
        ExcelUtil excelUtil = new ExcelUtil();
        String filePath = "C:/Users/Admin/Desktop/selenium/TestData.xlsx";
        String sheetName = "Sheet1";
        return excelUtil.getExcelData(filePath, sheetName);
    }

    @Test(dataProvider = "getTestData")
    public void test(String username, String password){
        System.out.println(username + " "+ password);
    }

}