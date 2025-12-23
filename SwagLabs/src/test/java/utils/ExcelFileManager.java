package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelFileManager {
    private XSSFWorkbook Workbook;
    private XSSFSheet sheet;
    public ExcelFileManager(String filePath,String sheetName){

    try {
        FileInputStream fileInputStream=new FileInputStream(new File(filePath));
        Workbook =new XSSFWorkbook(fileInputStream);
        sheet=Workbook.getSheet(sheetName);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }


}
    public String getSpecificalValue(int rowNum,int colNum){
    Cell cell=sheet.getRow(rowNum).getCell(colNum);
        DataFormatter dataFormatter=new DataFormatter();
        return dataFormatter.formatCellValue(cell);
    }
}
