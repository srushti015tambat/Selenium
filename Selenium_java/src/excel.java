import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel 
{

	public static void main(String[] args) throws IOException
	{
	FileInputStream fs= new FileInputStream("C:\\Users\\mahagram\\Documents\\excel.xlsx");
	XSSFWorkbook wb= new XSSFWorkbook(fs);
	XSSFSheet st=wb.getSheetAt(0);
	System.out.println(st.getRow(3).getCell(0));

	}

}
