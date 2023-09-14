package practiceFiles;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(2,5,4,6,5,3,6,62,56,3,3,10);
		Stream<Integer> s1=li.stream();
		
		s1.forEach(a->System.out.print(a+" "));
		System.out.println("");
		System.out.println("Even values are");
		
		li.stream().filter(n->n%2==0).forEach(a->System.out.print(a+" "));
		System.out.println("");
		
		System.out.println("Odd values are");
		li.stream().filter(a->a%2==1).forEach(b->System.out.print(b+" "));
		System.out.println("");
		
		System.out.println("Double of Odd values are");
		List<Integer> lis=li.stream().filter(a->a%2==1).map(b->b*2).collect(Collectors.toList());
		System.out.println(lis);
//		s1.forEach(a->System.out.print(a+" "));
//		s2.forEach(a->System.out.println(a));
		
		Long n=li.stream().filter(a->a%2==1).count();
		System.out.println(n);
		
		
		Integer minx=li.stream().min((x,y)->x.compareTo(y)).orElse(0);
		System.out.println(minx);
		
		Integer maxx=li.stream().max((x,y)->x.compareTo(y)).orElse(0);
		System.out.println(maxx);
		
		Double avg=li.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
		System.out.println(avg);
		
		OptionalDouble avg1=li.stream().mapToDouble(Integer::doubleValue).average();
		System.out.println(avg1);
		
		
	}

}
