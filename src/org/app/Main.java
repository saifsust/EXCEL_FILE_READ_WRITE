package org.app;

import java.util.ArrayList;
import java.util.List;

import org.excel.interfaces.Excel;
import org.factory.StudentFactory;
import org.models.Student;

public class Main {

	private static String PATH = "DATA/in.xlsx";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Workbook book = ExcelFactory.build(PATH).getXSSFWorkBook();
		 * 
		 * Sheet sheet = book.getSheetAt(0);
		 */

		/*
		 * Iterator it = sheet.iterator();
		 * 
		 * while (it.hasNext()) { Row currRow = (Row) it.next(); if (currRow.getRowNum()
		 * == 0) continue; Iterator<Cell> currCells = currRow.iterator(); while
		 * (currCells.hasNext()) { Cell cell = currCells.next(); if
		 * (cell.getCellTypeEnum() == CellType.STRING) {
		 * System.out.println(cell.getStringCellValue()); } } }
		 */

		List<Student> models = new ArrayList<>();

		Student stdnt1 = new Student(2013331007, "SAIFUL ISLAM", 98.78);

		models.add(new Student(2013331007, "SAIFUL ISLAM", 98.45));
		models.add(new Student(2013331008, "ZUBAYER HASAN", 69.45));

	/*	for (int i = 0; i < models.size(); ++i) {
			
			for (String str : models.get(i).getAll()) {

				System.out.println(str);
			}
		}

		for (String str : stdnt1.getAll()) {
			System.out.println(str);
		}*/

		Excel<Student> exclstdnt = new StudentFactory();
		 exclstdnt.write(models);

	}

}
