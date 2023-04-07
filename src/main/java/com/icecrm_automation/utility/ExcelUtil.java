package com.icecrm_automation.utility;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;

import java.io.IOException;

public class ExcelUtil {
	private Workbook workbook;
	private Sheet sheet;

	public Object[][] getExcelData(String filePath, String sheetName) {
		// C:/data/excel.xlsx
		try {
			FileInputStream inputStream = new FileInputStream(filePath);
			String extension = filePath.substring(filePath.indexOf(".") + 1);
			System.out.println(extension);
			if (extension.equals("xlsx")) {
				workbook = new XSSFWorkbook(inputStream);
			} else {
				workbook = new HSSFWorkbook(inputStream);
			}
			sheet = workbook.getSheet(sheetName);
			int totalRows = sheet.getPhysicalNumberOfRows();
			int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			// create 2 dimensional object with total rows and columns
			Object[][] object = new Object[totalRows - 5][totalColumns]; // 2 dimensional object

			for (int i = 5; i < totalRows; i++) { // to iterate through rows
				for (int j = 0; j < totalColumns; j++) {
					Cell cell = sheet.getRow(i).getCell(j);
					if (cell.getCellType().equals(CellType.STRING)) {
						object[i - 5][j] = cell.getStringCellValue();
					} else if (cell.getCellType().equals(CellType.NUMERIC)) {
						object[i - 5][j] = cell.getNumericCellValue();
					} else if (cell.getCellType().equals(CellType.BLANK)) {
						System.out.println("Blank Value");
						object[i - 5][j] = null;
					}

				}
			}
			workbook.close();
			inputStream.close();
			return object;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
