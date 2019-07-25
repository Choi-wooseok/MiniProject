package ch11_datastruct.exam;

import java.util.Arrays;

public class StringArrayList {
	
	String[] elements = new String[5];
	int pos = 0;
	
	
	
	public void add(String name) {
		//배열 늘리기
		if (elements.length == pos) {
			Arrays.copyOf(elements, pos * 2);
		}
		elements[pos] = name;
		pos++;
	}
	
	public void add(int arrNum, String name) {
		elements[arrNum] = name;
	}
	
	String get(int getNum) {
		return elements[getNum];
	}
	
	int size() {
		return elements.length;
	}
	
	void remove(int del) {
		System.arraycopy(elements, del + 1, elements, del, pos-del-1);
		pos--;
	}
	
	void clear() {
		
	}
	
	boolean isEmpty() {
		return pos == 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
















