package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<Integer> num = new ArrayList<Integer>();


		for (int j = 1; j<= 10;j++){
			num.add(j);
			System.out.print(j + " ");
		}
		System.out.println(num.get(3));
		num.remove(3);

		for (int n: num) {
			System.out.print(n);
		}
		System.out.println();

		List<String> list = new ArrayList<String>();

		list.add("walton laptop");
		list.add("Dell laptop");
		list.add("mac laptop");
		list.add("hp laptop");
		list.add("asus laptop");
		list.add("mitshubishi laptop");


		int j = 0;
		while (list.size() > j) {
			System.out.println(list.get(j));
			j++;
		}
		System.out.println();

		for (String str: list) {
			System.out.println(str);
		}

		System.out.println();
		Iterator itr = list.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}



	}

}
