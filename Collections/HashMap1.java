package Collections;
import java.util.HashMap;
import java.util.Map;
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Aryan",1);
		map.put("Aryan1",1);
		map.put("Aryan2",1);
		map.put("Aryan3",1);
		System.out.println(map);
		System.out.println(map.containsKey("Aryan"));
		Integer value=map.get("Aryan1");
		System.out.println(value);
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.print(e.getKey()+"-");
			System.out.println(e.getValue());
		}
	}

}
