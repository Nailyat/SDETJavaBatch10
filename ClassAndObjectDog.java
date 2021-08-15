package com.syntax.class12;

public class ClassAndObjectDog {

	
		
		// Dog
		
		String name;
		String breed;
		String color;
		int age;
		double height;
		char gender;
		
		void bark() {
			System.out.println("Dog can bark");
		}
		
		void sleep() {
			System.out.println("Dog can sleep");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ClassAndObjectDog dog=new ClassAndObjectDog(); //class name and new name=new given class name
			dog.name="James";
			dog.breed="Bull Dog";
			dog.color="White";
			dog.age=2;
			dog.height=15;
			dog.gender='M';
			
			dog.bark();
			dog.sleep();
			
			System.out.println("------------Another Dog---------");
			ClassAndObjectDog dog1=new ClassAndObjectDog(); //class name and new name=new given class name
			dog1.name="Bingo";
			dog1.breed="Shibu Inu";
			dog1.color="Ginger";
			dog1.age=1;
			dog1.height=40;
			dog1.gender='F';
			
			dog1.sleep();
			
			
	}

}
