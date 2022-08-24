package Assignment;

import java.util.Random;

public class WageComputation {
	
	
	
	
	public static void absent() {
//		static method
	Random random = new Random();
	long num = (long) (Math.random()*10);
	
	if(num%2==0) {
		System.out.println("Present");
	}
	else System.out.println("absent");
		
	}
	
	
	public static void main(String[] args) {
		//static main method\
		
		
		absent();
		
		
		
	}
	
	
	
}
