package org.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> itemList = new ArrayList<String>();
		itemList.add("Shirt");
		itemList.add("Jacket");
		itemList.add("Shoes");
		itemList.add("Trousers");
		
		for(String item:itemList) {
			System.out.println(item);
		}
		itemList.add(2,"Tie");
		itemList.remove(3);
		Iterator<String> items = itemList.iterator();
		while(items.hasNext()) {
			String item = items.next();
			System.out.println(item);
		}

	}

}
