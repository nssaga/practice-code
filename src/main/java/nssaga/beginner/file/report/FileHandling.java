/**
  FileHandling.java
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
package nssaga.beginner.file.report;

import nssaga.beginner.file.report.service.CSVReportProcessing;
import nssaga.beginner.file.report.service.ReportProcessing;

public class FileHandling {
	public static void main(String[] args) {
		System.out.println("Report reading started...");

		String filePath = "/Users/nawalsah/Code/git/practice-code/data/Income Report.csv";

		ReportProcessing reportProcessing = new CSVReportProcessing();
		reportProcessing.processFile(filePath);

	}
}
