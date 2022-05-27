package com.mycompany.interfaceenhancement;

public class Car implements vehicle7 {

	public void getDetails() {
		
		Car c = new Car();
		c.show();
		c.showNew();
		
		Bus b = new Bus();
		b.show();
		b.showNew();
		
	}

	public Double mileage() {
		return null;
	}
	
	@Override
	public void show() {
	
	
	}	

}
