package temp;

import java.util.Scanner;

abstract class Creature{
	abstract void speak();
	
	void print() {
		System.out.println("Printing something");
	}
	void name() {
		System.out.println("Name");
	}
}

class Dog extends Creature{
	void speak() {
		System.out.println("Bark ");
	}
	
	void name() {
		System.out.println("Jojo");
	}
	
	void food() {
		System.out.println("Bone");
	}
	
}

class Horse extends Creature{
	void speak() {
		System.out.println("Kneee");
	}
	void name() {
		System.out.println("Chetak");
	}
}

public class abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creature d1=new Dog(); 
		d1.speak();
		d1.name();
		
		
		
		Creature h1=new Horse();
		h1.speak();
		h1.name();
		h1.print();
		
		Student s2=new Student();
		Scanner scn=new Scanner(System.in);
		
	}

}
