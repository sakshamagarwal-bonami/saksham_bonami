package Collections;
import java.util.*;
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
	
}
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("a");
		ts.add("X");
		ts.add("B");
		ts.add("H");
		ts.add("Y");
		ts.add("A");
		System.out.println(ts);//Default sorting order
//		ts.add(null);
		System.out.println("A".compareTo("Z"));
		System.out.println("a".compareTo("C"));
		System.out.println("A".compareTo("A"));
		
		TreeSet<String> ants=new TreeSet<>(new MyComparator());
		ants.add("a");
		ants.add("X");
		ants.add("B");
		ants.add("H");
		ants.add("Y");
		ants.add("A");
		System.out.println(ants);//Default
		
	}

}
