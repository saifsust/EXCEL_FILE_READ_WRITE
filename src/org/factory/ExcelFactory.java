package org.factory;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFactory {

	private static File file;
	private Workbook workBook;

	private ExcelFactory(String FILE_NAME) {

		try {
			file = new File(FILE_NAME);
		} catch (Exception ex) {
			// TODO: handle exception

			System.out.println("READ EXCEPTION : " + ex.getMessage());
			throw new RuntimeException(ex);
		}
		System.out.println("CREATE WORK BOOK SUCCESSFULLY");

	}

	public static ExcelFactory build(String FILE_NAME) {
		return new ExcelFactory(FILE_NAME);
	}

	public Workbook getWorkBook() {
		try {
			return WorkbookFactory.create(file);
		} catch (Exception ex) {
			System.out.println("WORk BOOK : " + ex.getMessage());
			throw new RuntimeException(ex.getMessage());
		}

	}

	public Workbook getXSSFWorkBook() {
		try {
			return new XSSFWorkbook(new FileInputStream(file));
		} catch (Exception ex) {
			System.out.println("XSS : " + ex.getMessage());
			throw new RuntimeException(ex);
		}
	}



}
