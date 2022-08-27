package com.bl.Assignment;

public class WageComputation {
	public static final int Is_Partime = 1;
	public static final int Is_Fulltime = 2;
	public static final int Rate_Phr = 20;
	public static final int Total_working_day = 2;
	public static void main(String[] args) {
		int empHrs = 0, empWage = 0, totalEmpWage = 0;
		for (int day = 0; day < Total_working_day; day++) {
			int empCheck = (int) Math.floor(Math.random()) % 3;
			switch (empCheck) {
			case Is_Partime:
				empHrs = 4;
				break;
			case Is_Fulltime:
				empHrs = 8;
				break;
				default:
					empHrs = 0;
					
			
			}
			empWage = empHrs * Rate_Phr;
			totalEmpWage += empWage;
			System.out.println("Emp Wage " +empWage);
			
		}
		System.out.println("Total Emp Wage" + totalEmpWage);
	}
		}
	
			
	
		
		
	
	
	
	

