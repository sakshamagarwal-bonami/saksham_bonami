package practiceFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running");
		Scanner scn=new Scanner(System.in);
		ArrayList<String> strArr=new ArrayList<>();
		
		String temp;
		temp=scn.next();
		while(!temp.equals("-1")) {
			strArr.add(temp);
			temp=scn.next();
		}
		strArr.stream().forEach(a->System.out.println(a));
		
	}

}
