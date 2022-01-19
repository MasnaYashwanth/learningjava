package com.timesheet.impl;

import java.util.Date;

import com.timesheet.TimeSheetInterface;
import com.timesheet.model.TimeSheet;

public class DefaultTimeSheet implements TimeSheetInterface {

	@Override
	public TimeSheet creatTimeSheet(int timesheetId, int empId, Date date, String activity, String descripition,
			float hrs, String status) {

		TimeSheet timeSheet = new TimeSheet();
		timeSheet.setTimesheetId(100);
		timeSheet.setEmpId(5135);
		timeSheet.setDate(new Date());
		timeSheet.setActivity("Writing Test Case");
		timeSheet.setDescripition("Test case for Create time sheet");
		timeSheet.setHrs(8);
		timeSheet.setStatus("Submitted");
		return timeSheet;
	}

	@Override
	public TimeSheet changeStatus(int timesheetId, int empId, Date date, String activity, String descripition,
			float hrs, String status) {

		TimeSheet timeSheet = new TimeSheet();
		timeSheet.setTimesheetId(100);
		timeSheet.setEmpId(5135);
		timeSheet.setDate(new Date());
		timeSheet.setActivity("Writing Test Case");
		timeSheet.setDescripition("Test case for Create time sheet");
		timeSheet.setHrs(8);
		timeSheet.setStatus("Submitted");
		//System.out.println("timeSheet.setStatus");
		return timeSheet;
	}
}