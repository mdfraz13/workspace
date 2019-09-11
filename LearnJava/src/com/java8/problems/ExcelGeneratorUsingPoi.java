package com.java8.problems;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGeneratorUsingPoi {
	
	private static final String[] COLUMNs = { "transactionId", "Title", "Requestor", "Date", "Category", "Amount",
			"Approver", "Status" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			CreationHelper createHelper = workbook.getCreationHelper();

			Sheet sheet = workbook.createSheet("ExpenseReport");

			Font headerFont = workbook.createFont();
			headerFont.setBold(true);
			headerFont.setColor(IndexedColors.BLUE.getIndex());

			CellStyle headerCellStyle = workbook.createCellStyle();
			headerCellStyle.setFont(headerFont);

			// Row for Header
			Row headerRow = sheet.createRow(0);

			// Header
			for (int col = 0; col < COLUMNs.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(COLUMNs[col]);
				cell.setCellStyle(headerCellStyle);
			}

			int rowIdx = 1;
			System.out.println("Adding rows to the sheet ");
			for (int i=0;i<10;i++) {
				System.out.println("Expense report "+i);
				Row row = sheet.createRow(rowIdx++);

//				row.createCell(0).setCellValue(report.getTransactionId());
//				row.createCell(1).setCellValue(report.getReportTitle());
//
//				String name = "";
//				if (report.getUsername() != null) {
//					User user = userDao.findByUsername(report.getUsername());
//					if (user != null) {
//						name = user.getFirst_name() + " " + user.getLast_name();
//					}
//				}
//				row.createCell(2).setCellValue(name);
//				row.createCell(3).setCellValue(report.getReportDate());
//				row.createCell(4).setCellValue(report.getExpenseCategory());
//				row.createCell(5).setCellValue(report.getTotalAmount().toPlainString());
//				row.createCell(6).setCellValue(report.getApprover());
//				row.createCell(7).setCellValue(report.getStatus());
				row.createCell(0).setCellValue("dsa1");
				row.createCell(1).setCellValue("1dsa");
				row.createCell(2).setCellValue("1adas");
				row.createCell(3).setCellValue("1adsa");
				row.createCell(4).setCellValue("sdsa1");
				row.createCell(5).setCellValue("sad1");
				row.createCell(6).setCellValue("sadsa1");
				row.createCell(7).setCellValue("dsad1");
			}
			System.out.println("Completed the rows addinng to workbook ");
			workbook.write(out);
			//return new ByteArrayInputStream(out.toByteArray());
		} catch (Exception e) {
			System.err.print("Exception while creating file "+e);
		}
	}

}
