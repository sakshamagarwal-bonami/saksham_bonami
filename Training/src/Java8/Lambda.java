package Java8;

import java.util.function.Predicate;

interface eg{
	int sum(int c,int d);
//	int add(int a,int b);
	
}
interface a{
	void print();
}
interface predicate{
	boolean test(Integer z);
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		eg obj=(int a,int b)->{
			System.out.println("x");
			return a+b;
		};
		obj.sum(1, 3);
		a aobj=()->{
			System.out.println("Hello");
		};
		aobj.print();
		
		
//		obj2.show();
//		System.out.println(a);
		predicate p=(Integer z)->{
			return 10>11;
		};
		System.out.println(p.test(1));
		String st="Helloooo";
		Predicate<String> pr= str->(str.length()>3);
		
	}

}
