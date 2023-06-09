package temp;

import java.util.Scanner;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isUpperCase(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.toLowerCase(ch));
		System.out.println(Character.toUpperCase(98));
		String b="a";
		System.out.println(Byte.valueOf(b));
	}

}
