/***********************************************************************  
***  
***  File: Pythagorean.java
***  Author: Jamil Ramsey (Edited by Tariq Amankwah)
***  Date: 10/15/2019
***
***  Impelement Pythgorean Theroem
***  c = sqrt(a^2 + b^2)
***  We assume the input of the program will include one variable equal
***  to 0 and the other two variables greater than 0
***
************************************************************************/

import java.util.Scanner;
import java.lang.Math;

class Pythagorean {
	public static void main(String[] args) {
		
		
		// Initialize variables
		double a;
		double b;
		double c;
		//double answer;
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = input.nextDouble();
		
		System.out.println("Enter B:");
		b = input.nextDouble();
		
		System.out.println("Enter C:");
		c = input.nextDouble();
		
		Pythag(a,b,c);
	}

	public static void Pythag(double a,double b,double c){
		double answer;
		// After program refactor I used the initial program state C as the unknown side to determine the first if statement.
		if(c == 0) {
			//	System.out.println("C is equal to: " + Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
			answer = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
			System.out.println("C is equal to: " + answer);
		}
		// If a is equal to 0 we must alter the formula to a = sqrt(c^2 - b^2)
		else if (a == 0) {
			answer = Math.sqrt(Math.pow(c,2)-Math.pow(b,2));
			System.out.println("A is equal to: " + answer);
		}
		// Since there are only three inputs and we have checked for the other two cases, this case must be b = sqrt(c^2 - a^2)
		else {
			answer = Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
			System.out.println("B is equal to: " + answer);
		}
	}
	public static char unknown(double a, double b, double c){
			if(c == 0) {
				return 'C';
			}
			// If a is equal to 0 we must alter the formula to a = sqrt(c^2 - b^2)
			else if (a == 0) {
				return 'A';
			}
			// Since there are only three inputs and we have checked for the other two cases, this case must be b = sqrt(c^2 - a^2)
			else {
				return 'B';
			}
		}
	}