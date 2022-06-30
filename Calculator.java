import java.util.Scanner;

public class Calculator {

	public static double res;
	public static double add(double a, double b) {

		res = a+b;
		return 0.0;
	}
     
	public static double subt(double a, double b) {

		res = a-b;
		
		return 0.0;
	}
	   
	public static double mult(double a, double b) {

		 res = a*b;
		return 0.0;
	}
	
	public static double div(double a, double b) {

		res = a/b;
		return 0.0;
	}
	public static double display() {

		System.out.println("Result is : "+res);
		return res;
	}
  
	

	public static void main(String[] args) {
		double c;
		Calculator cl = new Calculator();
		cl.add(20, 30);
		cl.display();
		cl.subt(60,20);
		cl.display();
		cl.mult(96, 4);
		cl.display();
		cl.div(80, 4);
		cl.display();
		
	
	}
}


