package util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	XSSFWorkbook wb;

	public ExcelUtil(String xlpath) {
		File file = new File(xlpath);
		try {
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getRowCount(int sheetindex) {
		return wb.getSheetAt(sheetindex).getLastRowNum() + 1;
	}

}
