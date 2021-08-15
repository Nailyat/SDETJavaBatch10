package com.syntax.class12;

public class ClassAndObjectCat {
	
	String name;
	String color;
	int age;
	void eat() {
		System.out.println(name+" is eating");
	}
	void sleep() {
		System.out.println(name+" is sleeping");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAndObjectCat cat=new ClassAndObjectCat();
		
		cat.name="Myavka";
		cat.color="Black and White";
		cat.age=2;
		
		cat.eat();
		cat.sleep();
		
		System.out.println("------------Another Cat--------------");
		ClassAndObjectCat cat1=new ClassAndObjectCat();

		cat1.name="Tom";
		cat1.color="Grey and White";
		cat1.age=5;
		cat1.sleep();
	}

}
