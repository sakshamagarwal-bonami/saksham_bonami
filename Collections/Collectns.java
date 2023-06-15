package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Collectns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<>();
		al.add("Hi");
		al.add("boAt");
		al.add("JBL");
		System.out.println(al);
		Collections.addAll(al,"web","site");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
