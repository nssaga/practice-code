/**
  EnumDays.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 14-Jan-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.enums;

import java.util.EnumSet;
import java.util.Set;

public class EnumDays {

	private enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
		
		public static Set<Days> allDays = EnumSet.allOf(Days.class);
		public static Set<Days> weekDays = EnumSet.range(MONDAY, FRIDAY);
		public boolean isWeekDay() {
			return weekDays.contains(this);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Days "+Days.allDays);
		System.out.println("Week Days "+Days.weekDays);
		System.out.println("isWeekDay "+Days.FRIDAY.isWeekDay());
	}
	
}
