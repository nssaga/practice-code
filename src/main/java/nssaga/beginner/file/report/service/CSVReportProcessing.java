/**
  CSVReportProcessing.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 11-Aug-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.file.report.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import nssaga.beginner.file.report.model.IncomeReport;

public class CSVReportProcessing implements ReportProcessing {

	private static final String COMMA = ",";

	@Override
	public List<IncomeReport> processFile(String filePath) {

		List<IncomeReport> incomeReports = new ArrayList<>();

		try (InputStream inputStream = new FileInputStream(new File(filePath))) {
			BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream));
			incomeReports = bReader.lines().skip(1).map(mapToIncomeReport).collect(Collectors.toList());
			System.out.println(incomeReports);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {

		}

		return incomeReports;
	}

	private Function<String, IncomeReport> mapToIncomeReport = line -> {
		String[] p = line.split(COMMA);// a CSV has comma separated lines
		IncomeReport rowData = new IncomeReport();
		rowData.setCity(p[0]); // <-- this is the first column in the csv file
		rowData.setCountry(p[1]);
		rowData.setAge(p[2]);
		rowData.setGender(p[3]);
		rowData.setAverageIncome(Double.parseDouble(p[4]));
		return rowData;
	};

}
