import java.util.Comparator;

public class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer) obj1;
		Integer i2=(Integer) obj2;
		return -i1.compareTo(i2);
	}
}
