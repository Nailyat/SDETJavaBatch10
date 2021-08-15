package com.syntax.class12;

public class CarTester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAndObjectCar car=new ClassAndObjectCar();
		car.make="Lexus";
		car.model="RX350L";
		car.color="White";
		car.year=2021;
		System.out.println("I have "+car.make);

		car.moveForward();
		
		
		System.out.println("----------Another Car------------");
		ClassAndObjectCar car1=new ClassAndObjectCar();
		car1.make="Tesla";
		car1.model="Y";
		car1.color="White";
		car.year=2022;
		System.out.println("I have "+car1.make);

		car1.moveForward();
	}

}
