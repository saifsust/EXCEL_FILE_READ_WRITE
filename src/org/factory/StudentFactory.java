package org.factory;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.excel.interfaces.Excel;
import org.models.Student;

public class StudentFactory implements Excel<Student> {

	private String FILE_NAME = "DATA/out.xlsx";

	@Override
	public List<Student> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(List<Student> models) {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Students");

		for (int rowNum = 0; rowNum < models.size(); ++rowNum) {

			Row currRow = sheet.createRow(rowNum);
			for (int cellNum = 0; cellNum < models.get(rowNum).getAll().size(); ++cellNum) {

				String field = models.get(rowNum).getAll().get(cellNum);

				Cell currCell = currRow.createCell(cellNum);
				currCell.setCellValue(field);
			}

		}

		try {
			File file = new File(FILE_NAME);

			if (!file.exists()) {
				file.createNewFile();
			}

			FileOutputStream outStream = new FileOutputStream(file);
			workbook.write(outStream);
			outStream.flush();
			outStream.close();
			workbook.close();

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}

	}

}
