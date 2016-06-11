package com.samsung.javaConcepts;

class Animal
{
	public void noise()
	{
		System.out.println("Animal noise");
	}
}

class Dog extends Animal
{
	public void noise()
	{
		System.out.println("Dog noise");
	}
	public void eat()
	{
		System.out.println("Dog eating");
	}
}

public class Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A = getObject();
		A.noise();
		//A.eat();
		
	}
	
	public static Animal getObject()
	{
		Animal Ab = new Dog();
		return Ab;
	}

}
