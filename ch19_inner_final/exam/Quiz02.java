package ch19_inner_final.exam;

import java.util.ArrayList;
import java.util.Iterator;

class MyArray{
	String[] arr = {"a","b","c"};
	int pos = 3;
	
	public Iterator iterator() {
		return new MyIterator();
	}
	class MyIterator implements Iterator {
		int index = 0;
		public boolean hasNext() {
			return index < pos;
		}
		public Object next() {
			return arr[index++];
		}
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		System.out.println(list.size());
//		System.out.println(list.remove(0));
//		System.out.println(list.get(0));
//		System.out.println(list);
//		
//		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}   이런식의 활용이 가능하다!
		
		
		
		MyArray ma = new MyArray();
		Iterator ite = ma.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}

















