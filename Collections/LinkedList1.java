package Collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll=new LinkedList<>();
		ll.add(100);
		ll.add(700);
		ll.add(400);
		ll.add(200);
		ll.add(900);
		ll.add(600);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.add(2, 350);
		System.out.println(ll);
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll);
	}

}
