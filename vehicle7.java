package com.mycompany.interfaceenhancement;

public interface vehicle7 {

	default void show() {
		
	System.out.println("added new feature 1");
	}
	default void showNew() {
		
		System.out.println("added new feature 2");
	}
	void getDetails();//public abstract
	String COLOR = "RED";//public static final
    Double mileage();//public abstract
		
}
