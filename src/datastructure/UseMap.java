package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> cityOfUSA = new ArrayList<String>();
		cityOfUSA.add("NY");
		cityOfUSA.add("FL");
		cityOfUSA.add("CA");

		List<String> cityOfUK = new ArrayList<String>();
		cityOfUK.add("london");
		cityOfUK.add("Manchester");
		cityOfUK.add("scotland");

		List<String> cityOfBD = new ArrayList<String>();
		cityOfBD.add("Dhaka");
		cityOfBD.add("Rajshahi");
		cityOfBD.add("commilla");

		Map<String, List<String>> newMap = new HashMap<>();
		newMap.put("usa", cityOfUSA);
		newMap.put("uk", cityOfUK);
		newMap.put("BD", cityOfBD);

		for(Map.Entry en: newMap.entrySet()){
			System.out.println(en.getKey()+"   "+en.getValue());
		}
		Iterator<Map.Entry<String, List<String>>> itr = newMap.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry en = itr.next();
			System.out.println(en.getKey()+"   "+en.getValue());
		}


	}

}
