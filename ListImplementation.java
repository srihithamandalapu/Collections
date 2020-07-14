package srihitha.collections.list;

import java.util.*;
public class ListImplementation {

	public static void main(String args[]) {
		
		List<Integer> list = new List<>();//Creation of list
		
		//add method can be used to append elements into list
		
		list.add(9);
		list.add(5);
		list.add(20);
		
		System.out.print(list+"\n");
		
		list.remove(1);
		
		System.out.print(list+"\n");
		
		System.out.print("Length of list is "+ list.size()+"\n");
		
		list.add(22);
		
		System.out.print(list+"\n");
		
		System.out.print("Element at index 0 is :"+list.get(0));
		
		
		
	}
}
