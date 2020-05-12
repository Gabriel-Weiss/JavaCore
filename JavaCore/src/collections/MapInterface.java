package collections;

import java.util.Comparator;
import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
//		LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
//		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		map.put(1,"unu");
		map.put(2,"doi");
		map.put(3,"trei");
		map.put(4,"patru");
		
		for(Map.Entry<Integer, String> m:map.entrySet()) System.out.println(m.getKey()+" "+m.getValue());
		System.out.println();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

	}

}
