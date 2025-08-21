package org.collection;

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> cart =  new LinkedHashMap();
		cart.put("Shirt", 2000);
		cart.put("Trouser", 1000);
		cart.put("Shoes", 200);
		cart.put("Tie", 600);
		
		for(Map.Entry<String, Integer> ci: cart.entrySet()) {
			System.out.println("Item: "+ci.getKey()+"Has price"+ci.getValue());
		}		

	}

}

/*
 * HashMap: Doesn't maintain order.
 * Allows null keys and values.
 * Not thread Safe.
 */


/*
 * LinkedHashMap:Maintain insertion order
 * 
 */
