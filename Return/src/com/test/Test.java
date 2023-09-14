package com.test;

abstract class A{
	Integer age;
	String name;
	abstract void func();
	Integer func1(Integer n) {
		return n;
	}
}
class B extends A{

	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("func called");
		
	}
	
}

interface abcd
{
	void hello();
	void tello();
	default String bye() {
		return "bye";
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj =new B();
		obj.name="Saksham";
		System.out.println(obj.name);
		obj.func();
		Integer a=obj.func1(5);
		System.out.println(a);
	}

}
