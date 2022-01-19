package com.timesheet.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.timesheet.model.TimeSheet;

class TimeSheetTest {

	@Test
	void creatTimeSheetTest1() {
		DefaultTimeSheet ts = new DefaultTimeSheet();
		TimeSheet timeSheet = ts.creatTimeSheet(0, 0, null, null, null, 0, null);
		assertTrue(timeSheet.getHrs() <= 8);

	}

	@Test
	void creatTimeSheetTest2() {
		DefaultTimeSheet ts = new DefaultTimeSheet();
		TimeSheet timeSheet = ts.creatTimeSheet(0, 0, null, null, null, 0, null);
		assertTrue(timeSheet.getHrs() > 0);
	}

	@Test
	void creatTimeSheetTest3() {
		DefaultTimeSheet ts = new DefaultTimeSheet();
		TimeSheet timeSheet = ts.changeStatus(0, 0, null, null, null, 0, null);
		assertNotNull(timeSheet.getStatus());
		//assertFalse(timeSheet.getStatus());
		//assertNull(timeSheet.getStatus());
		//assertThat(timeSheet.getStatus());
		//fail(timeSheet.getStatus());
		// assertNotSame(timeSheet.getStatus());
		// assertSame(timeSheet.getStatus());
		// assertArrayEquals(timeSheet.getStatus());
		// assertEquals(timeSheet.getStatus());
		// assertTrue(timeSheet.getStatus());
		System.out.println("timeSheet.getStatus()");
	}

}
