

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelREad {

	public static void main(String... args) throws Throwable {
		
		try{
		FileInputStream file = new FileInputStream("C:\\Users\\703426\\workspace\\syudy.oops\\src\\resourcs\\Data.xlsx");
		XSSFWorkbook xw = new XSSFWorkbook(file);
		XSSFSheet sh = xw.getSheet("Sheet1");
		XSSFRow rw = sh.getRow(1);
		XSSFCell cl = rw.getCell(2);
		System.out.println(cl.getStringCellValue());
		}
		catch(IOException e){
			throw e;
		}
		finally{
			System.exit(0);
			System.out.println("Rahul Mendiratta123");
		}
		
	}
	
}
