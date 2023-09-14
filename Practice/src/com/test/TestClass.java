package com.test;

class Test{
	protected int x,y;
}

class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		someMethod(null);
//		System.out.println(fun());
		Test t=new Test();
		System.out.println(t.x+" "+t.y);
		int x=3,y=5,z=10;
		System.out.println(++z + y - y + z + x++);
		float a=35/0;
		System.out.println(a);
		
	}
	
	

}
