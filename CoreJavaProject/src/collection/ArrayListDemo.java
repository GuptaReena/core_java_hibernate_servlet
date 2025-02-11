package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList<String> allFoods = new ArrayList<>(); // not recomended
		
		List<String> allFoods = new ArrayList<>(); // recomended way
		//List<String> allFoods = new LinkedList<>();
		
		//CRUD - Create, Read, Update, Delete
		// C - Create
		allFoods.add("Bhel Puri");
		allFoods.add("Pani Puri");
		allFoods.add("Dahi Papadi Chat");
		allFoods.add("Pav Bhaji");
		allFoods.add("Sev Puri");
		allFoods.add("Samosa Chat");
		allFoods.add("Bhel Puri");
		
		// R - Read
		// traversing the collection
		// 1.
		for(int i=0;i<allFoods.size();i++) {
			System.out.println(allFoods.get(i));
		}
		
		System.out.println("---------------");
		// 2
		for(String eachFood: allFoods) {
			System.out.println(eachFood);
		}
		
		System.out.println("---------------");
		// 3
		Iterator itr = allFoods.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------");
		// 4
		allFoods.forEach((item)->System.out.println(item));
		System.out.println("---------------");
		
		// U - Update
		String updateStr = "Pani Puri";
		for(int i=0;i<allFoods.size();i++) {
			if(allFoods.get(i).equals(updateStr)) {
				allFoods.set(i, "Pani Poori");
				break;
			}
		}
		allFoods.forEach((item)->System.out.println(item));
		System.out.println("---------------");
		// D - Delete
		// remove elements ending with "Chat" from the collection allFoods
		// 1
//		for(int i=0;i<allFoods.size();i++) {
//			if(allFoods.get(i).endsWith("Chat")) {
//				allFoods.remove(i);
//				//allFoods.remove(allFoods.get(i));
//			}
//		}
//		allFoods.forEach((item)->System.out.println(item));
		
		// 2
		allFoods.removeIf((item)->item.endsWith("Chat"));
		allFoods.forEach((item)->System.out.println(item));
		
		System.out.println("---------------");
		
		allFoods.add(null);
		allFoods.add(null);
		allFoods.forEach((item)->System.out.println(item));
	}
}
