package com.Utility;

public class DateUtility {
	
		public static boolean LeapYear( int year) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				return true;
			else
				return false;
		}

		public static int setLastDate(int month, boolean leap) {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				return 30;
			} else if (month == 2) {
				if (leap)
					return 29;
				else
					return 28;
			} else 
				return 31;
			}
		}
