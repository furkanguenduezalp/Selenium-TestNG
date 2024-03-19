package com.cybertek.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelUtil {

    private Sheet workSheet;
    private Workbook workBook;
    private String path;

    public ExcelUtil(String path, String sheetName){
        try{
            //Open the ExcelFile
            FileInputStream ExcelFile = new FileInputStream(path);
            //Access the required test data sheet
            workBook = WorkbookFactory.create(ExcelFile);
            workSheet =  workBook.getSheet(sheetName);
            // check if sheet is null or not. null means sheetname was wrong
            Assert.assertNotNull(workSheet, "Sheet: \""+sheetName+"\" does not exist\n");
        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    public List<String> getColumnsNames(){
        List<String> a = new ArrayList<>();
        return a;
    }
    public List<Map<String, String>> getDataList(){
        List<Map<String, String>> b = new ArrayList<>();
        return b;
    }
    public String[][] getDataArray(){
        String [][] data = new String[rowCount()][columnCount()];

        for (int i = 0; i < rowCount(); i++) {
            for (int j = 0; j < columnCount(); j++) {
                String value = getCellData(i,j);
                data[i][j] = value;
            }
        }
        return data;
    }
    public String[][] getDataArrayWithoutFirstRow(){
        String [][] data = new String[rowCount()-1][columnCount()];

        for (int i = 1; i < rowCount(); i++) {
            for (int j = 0; j < columnCount(); j++) {
                String value = getCellData(i,j);
                data[i-1][j] = value;
            }
        }
        return data;
    }
    public String getCellData(int rowNum, int colNum){
        Cell cell;
        try {
            cell = workSheet.getRow(rowNum).getCell(colNum);
            String cellData = cell.toString();
            return cellData;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public int columnCount(){return workSheet.getRow(0).getLastCellNum();}
    public int rowCount(){ return workSheet.getLastRowNum()+1;}

}
