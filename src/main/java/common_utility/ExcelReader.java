package common_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
public  String readExcelSheet_invalidcode(String S) throws IOException {
		  
	    String invalidcode="";
		String path = System.getProperty("user.dir")+"/src/test/resources/testdata/pythoncode.xlsx";
		File Excelfile = new File(path);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet_SIA = workbook.getSheet("Searchthearray");
		XSSFSheet sheet_MCO = workbook.getSheet("MaxConsecutiveOnes");
		XSSFSheet sheet_FED = workbook.getSheet("FindNumbersEvenNumberDigits");
		XSSFSheet sheet_SSA = workbook.getSheet("SquaresSortedArray");
        
        switch(S) {
        
        case "Searchthearray":
        	XSSFRow coderow_SIA=sheet_SIA.getRow(1);		
    				
    		invalidcode=coderow_SIA.getCell(1).toString();
    		System.out.println(invalidcode);
    		break;
        case "MaxConsecutiveOnes":
        	XSSFRow coderow_MCO=sheet_MCO.getRow(1);		
    			
    		invalidcode=coderow_MCO.getCell(1).toString();
    		System.out.println(invalidcode);
    		break;
        case "FindNumbersEvenNumberDigits":
        	XSSFRow coderow_FED=sheet_FED.getRow(1);		
    		
    		//XSSFRow invalidcoderow=sheet_SIA.getRow(1);		
    		invalidcode=coderow_FED.getCell(1).toString();
    		System.out.println(invalidcode);
    		break;
        case "SquaresSortedArray":
        	XSSFRow coderow_SSA=sheet_SSA.getRow(1);		
    		
    		invalidcode=coderow_SSA.getCell(1).toString();
    		System.out.println(invalidcode);
    		break;
    		
        default:
        	System.out.println("Enter valid Sheet name");
        	
        }
        workbook.close();
		return invalidcode;
   }
       
public  String readExcelSheet_validcode(String S) throws IOException {
    	    String validcode="";
    	    
    		String path = System.getProperty("user.dir")+"/src/test/resources/testdata/pythoncode.xlsx";
    		File Excelfile = new File(path);
    		
    		FileInputStream Fis = new FileInputStream(Excelfile);
    		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
    		XSSFSheet sheet_SIA = workbook.getSheet("Searchthearray");
    		XSSFSheet sheet_MCO = workbook.getSheet("MaxConsecutiveOnes");
    		XSSFSheet sheet_FED = workbook.getSheet("FindNumbersEvenNumberDigits");
    		XSSFSheet sheet_SSA = workbook.getSheet("SquaresSortedArray");
            
            switch(S) {
            
            case "Searchthearray":
            	XSSFRow coderow_SIA=sheet_SIA.getRow(1);		
        		validcode=coderow_SIA.getCell(0).toString();
        		System.out.println(validcode);
        		
        		break;
            case "MaxConsecutiveOnes":
            	XSSFRow coderow_MCO=sheet_MCO.getRow(1);		
        		validcode=coderow_MCO.getCell(0).toString();
        		System.out.println(validcode);
        		
        		break;
            case "FindNumbersEvenNumberDigits":
            	XSSFRow coderow_FED=sheet_FED.getRow(1);		
        		validcode=coderow_FED.getCell(0).toString();
        		System.out.println(validcode);
        		
        		break;
            case "SquaresSortedArray":
            	XSSFRow coderow_SSA=sheet_SSA.getRow(1);		
        		validcode=coderow_SSA.getCell(0).toString();
        		System.out.println(validcode);
        		
        		break;
        		
            default:
            	System.out.println("Enter valid Sheet name");
            	
            }
        
       
		workbook.close();
		
		
		return validcode;
	
	
	
		}

}
