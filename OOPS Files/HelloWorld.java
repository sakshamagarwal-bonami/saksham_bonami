package temp;

import java.util.Scanner;



public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Scanner scn=new Scanner(System.in);
		String str1 =scn.next();
		
		System.out.println("this is it "+str1);
		int a=0;
		a=scn.nextInt();
		System.out.println(a);
		
		float f=scn.nextFloat();
		System.out.println("float variable is : ");
		System.out.println(f);
	}

}
