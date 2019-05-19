import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDrivenTesting {

	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		 

		String value=getCellData(2,2);
		System.out.println(value);

		String value1=getCellData(1,1);
		System.out.println(value1);
	}
	
	public static String getCellData(int rown,int colnum) throws IOException
	{
		fis=new FileInputStream("F:\\Data.xlsx");
		 wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheet("Sheet1");
		 row=sheet.getRow(1);
		cell=row.getCell(1);
		return cell.getStringCellValue();
		
	}
}