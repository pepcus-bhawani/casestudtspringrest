package com.casestudy2.csvtest.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.casestudy2.csvfiletest.entity.Attendance;
import com.casestudy2.csvfiletest.model.EmployeeRespose;
import com.casestudy2.csvfiletest.serviceI.IAttendanceService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeAttendanceControllerTest {
	
	@Mock
	IAttendanceService attendance;
	
    
	
	@Test
	public void getAttendace()
	{
         String str="1,22,true";
		 attendance.addEmployeeAttendance(str);
				
		
	}

}
