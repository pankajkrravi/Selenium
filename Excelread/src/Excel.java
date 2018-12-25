import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Excel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("H:\\Selenium");
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);
		HSSFSheet S = hssfWorkbook.getSheet("userdata");
		Iterator<Row> rowit = S.iterator();
		while (rowit.hasNext()) {
			System.out.println(rowit.next().getCell(0).getStringCellValue());
		}
	}
}
