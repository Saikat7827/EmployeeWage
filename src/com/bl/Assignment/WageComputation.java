package com.bl.Assignment;

import java.util.Random;

public class WageComputation {

	public static void main(String[] args) {
		int empHrs = 0;
		int halfhrs= 4;
		int wageperhr = 20;
		Random random = new Random();
		int randomnum = random.nextInt(2);
		
		if (randomnum == 1)
		{	
			int salary = halfhrs * wageperhr;
			empHrs = 4;
			System.out.println("Employee is Present");
			//empHrs = 4;
			int salary1 = halfhrs * wageperhr;
			System.out.println("Employee Wage is " +salary1);
			
			
		}	
			else {
				System.out.println("Employee is absent");
		int salary = empHrs * wageperhr;
		System.out.println("Employee Wage is" +salary );
			}
		}
	
			
	}
		
		
	
	
	
	

