package collection;

import java.util.*;

public class MyHashMap {

	public static void main(String[] args) {
TreeMap<String,Double> tm=new TreeMap<String,Double>();
		//HashMap<String,Double> tm=new HashMap<String,Double>();
		//LinkedHashMap<String,Double> tm=new LinkedHashMap<String,Double>();
tm.put("Black Tea",15.0);
tm.put("Lemon Tea", 15.0);
tm.put("Samosa",10.0);
tm.put("Ginger Tea", 15.0);
tm.put("Tea",12.0);

System.out.println(tm);


	}

}
