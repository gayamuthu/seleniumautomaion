package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		File file = new File("./data/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String row = wb.getSheetAt(0).getRow(0).getCell(0).toString();
		String cell = wb.getSheet("Login").getRow(1).getCell(1).toString();
		System.out.println(row);
		System.out.println(cell);
		int count = wb.getSheetAt(0).getLastRowNum()+1;
		System.out.println("Total no of rows"+count);
		for(int i=0;i<count;i++)
		{
			String row1 = wb.getSheetAt(0).getRow(i).getCell(0).toString();
			String cell2 = wb.getSheetAt(0).getRow(i).getCell(1).toString();
			System.out.println(row1+""+cell2);
		}
	}

}
