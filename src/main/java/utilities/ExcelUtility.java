package utilities;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Map;

public class ExcelUtility {


    private FileInputStream fis;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private XSSFRow row;
    private XSSFCell cell;
    private Map<String, Integer> coldata = new Hashtable<String, Integer>();

    public ExcelUtility(String excelpath, String sheetname) {
        try {
            fis = new FileInputStream(new File(excelpath));
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetname);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        colheadersData();
    }


    public int getLastRow() {
        return sheet.getLastRowNum();
    }

    public int getlastCellnumber() {
        return sheet.getRow(0).getLastCellNum();
    }


    public String getcelldata(int rowindex, int colindex) {
        String celldata = null;
        cell = sheet.getRow(rowindex).getCell(colindex);

        switch (cell.getCellType()) {
            case STRING:
                celldata = cell.getStringCellValue();
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    celldata = String.valueOf(cell.getDateCellValue());
                } else {
                    celldata = String.valueOf((long) cell.getNumericCellValue());
                }
                break;
            case BOOLEAN:
                celldata = String.valueOf(cell.getBooleanCellValue());
                break;
            case BLANK:
                celldata = "";
                break;
        }
        return celldata;

    }


    public void colheadersData() {

        for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {

            coldata.put(sheet.getRow(0).getCell(i).toString(), i);

        }

    }

    public String getcelldata(String colheaderName, int rowindex) {

        return getcelldata(rowindex, coldata.get(colheaderName));

    }


}

