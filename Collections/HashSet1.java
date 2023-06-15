package Collections;
import java.util.Set;

import java.util.HashSet;
import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {21,23,56,78,98,21,21,21,45};
		Integer[] arr2= {21,45,56,43,57,89,45,56};
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(arr));
		HashSet<Integer> set2=new HashSet<>();
		set2.addAll(Arrays.asList(arr2));
		set2.add(1);
		Set<Integer> union1=new HashSet<>(set1);
		union1.addAll(set2);
		System.out.println(set2);
		System.out.println(set1);
		System.out.println("Union is ");
		System.out.println(union1);
		
		Set<Integer> intersect=new HashSet<>(set1);
		intersect.retainAll(set2);
		System.out.println("Intersection is");
		System.out.println(intersect);
		
		HashSet<Integer> diff=new HashSet<>(set2);
		diff.removeAll(set1);
		System.out.println("Difference is");
		System.out.println(diff);
	}

}
