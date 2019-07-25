package ch11_datastruct;

import java.util.Arrays;

public class IntArrayStack {
	
	final int CAPACITY = 5;
	int top = -1;
	int[] stack = new int[CAPACITY];
		
	    public boolean empty(){ //비어있는지 물어보는
		    return top == -1;
	    }
	    public boolean full(){
			return top == CAPACITY - 1;
		}
		
	    public void add(int val) {
			stack[++top] = val;
		}
		/**
		 * 값을 꺼내고 실제 제거하지 않는다.
		 */
	    public int peek(){ //꽉 찼는지 물어보는
			return stack[top];
		}
		
	    public int del() {
			int val = peek();
			stack[top--] = 0;
			return val;
		}
		
		public String toString() {
			return "IntArrayStack" + Arrays.toString(stack);
		}
		
	}

