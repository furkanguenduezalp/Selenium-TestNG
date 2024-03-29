package com.cybertek.tests.day16_ddf;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {

    @Test
    public void readExcelFile(){

        //Create an object from ExcelUtil
        //it accepts two argument
        //Argument 1: location of  the file(path)
        //Argument 2: sheet that we want to open(sheetName)

        ExcelUtil qa3short = new ExcelUtil("src/test/resources/excel.xlsx", "QA1-all");
        //how many rows in the sheet
        System.out.println("qa3short.rowCount() = " + qa3short.rowCount());

        //how many columns in the sheet
        System.out.println("qa3short.columnCount() = " + qa3short.columnCount());

        //get all column names
        System.out.println("qa3short.getColumnsNames() = " + qa3short.getColumnsNames());

        //get all data in list of maps
        List<Map<String, String >> dataList = qa3short.getDataList();
        for (Map<String, String> onerow : dataList) {
            System.out.println(onerow);
        }

        //get a Doe as a value
        System.out.println("dataList.get(3) = " + dataList.get(3).get("lastname"));

        //get all data in 2d array
        String [][] dataArray = qa3short.getDataArray();
        System.out.println(Arrays.deepToString(dataArray));


    }
}
