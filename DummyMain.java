package com.mycompany.functionalinterface;

public class DummyMain {

	public static void main(String[] args) {

		Integer x1 =6;
		Integer x2 =10;
		
		IamAFunctionalInterface var = ()-> {System.out.println("hello world");};
			
		var.display();
		
		IamAFunctionalInterface var2 = ()-> {System.out.println("Bye world");};
		
		var2.display();
	}

}
