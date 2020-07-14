package srihitha.collections.list;

import java.util.*;



public class List<E> {

	private int size  = 0;
	private static final int min_size = 10;
	
	private Object array[];
	
	public List() {
	
		array = new Object[min_size];
	}
	
	public int size() {
		return size;
	}
	
	public void add(E ele) {
		
		if(size == array.length) {
			increaseSize();
		}
		
		array[size++] = ele;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: "+index+"Size :" + index);
		}
		return (E)array[index];
	}
	
	
	@SuppressWarnings("unchecked")
	public void remove(int index) {

		
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: "+index+"Size:"+index);
			
		}
		
		Object ele = array[index];
		int j;
		
		for(j = index ; j < size-1 ; j++) {
			array[j] = array[j+1];
		}
		
		size--;
		
		
	}

	@Override
	public String toString() {
		
		StringBuilder obj = new StringBuilder();
		obj.append('[');
		
		for(int i = 0 ; i < size ; i++ ) {
			obj.append(array[i].toString());
			obj.append(" ");
		
	
		}
		obj.append(']');
		
		return obj.toString();
	}
	
	public void  increaseSize() {
		
		int newSize = array.length*2;
		array = Arrays.copyOf(array, newSize);
	}

}


