package stack_Queue;

import java.util.Stack;

public class FindMinInStack {

	private Stack<Integer> elem = new Stack<>();
	private Stack<Integer> min = new Stack<>();
	
	public static void main(String[] args) {

	}

	public void push(int data) {
		if(min.isEmpty() || data < min.peek()) {
			elem.push(data);
			min.push(data);
		} else {
			elem.push(data);
			min.push(min.peek());
		}
	}
	
	public int peek() {
		return elem.peek();
	}
	
	public int pop() {
		int result = elem.pop();
		min.pop();
		return result;
	}
	
	public int min() {
		if(min.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return min.peek();
	}
}
