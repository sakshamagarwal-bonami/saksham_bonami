package practiceFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Integer n;
		 	System.out.println("Running");
		 	Scanner scn = new Scanner(System.in);
		 	n=scn.nextInt();
	       
	        System.out.println(n);
	        Integer temp=0;
	        ArrayList<Integer> arr=new ArrayList<>();
	        for(int i=0;i<n;i++) {
	        	temp=scn.nextInt();
	        	arr.add(temp);
	        }
	        for(int i=0;i<arr.size();i++) {
	        	System.out.println(arr.get(i));
	        }
	        arr.stream().forEach((s)->{
	        	System.out.println(s);
	        });
	        arr.stream().map(h->h*2).forEach(a->System.out.println(a));
	        
	}

}
