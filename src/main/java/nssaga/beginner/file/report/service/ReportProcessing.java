/**
  ReportProcessing.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 11-Aug-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.file.report.service;

import java.util.List;

import nssaga.beginner.file.report.model.IncomeReport;

public interface ReportProcessing {
	List<IncomeReport> processFile(String file);
}
