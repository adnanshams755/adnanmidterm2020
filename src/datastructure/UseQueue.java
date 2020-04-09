package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> myQueue= new LinkedList<>();
		myQueue.add("ny");
		myQueue.add("ca");
		myQueue.add("fl");
		myQueue.add("NJ");
		myQueue.add("CT");

		myQueue.remove("ny");
		myQueue.poll();
		System.out.println(myQueue.peek());

		Iterator it= myQueue.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(String my:myQueue){
			System.out.println(my);

		}

	}

}
