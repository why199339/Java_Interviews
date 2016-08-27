package stack_Queue;

import java.util.Arrays;

public class ArrayStack<E> {

	private Object[] stack;
	private int size;

	public ArrayStack() {
		stack = new Object[10];
	}

	public static void main(String[] args) {
		ArrayStack s = new ArrayStack();
		s.push(1);
		s.push(2);
		System.out.println(s.size);
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return (E) stack[size - 1];
	}

	public E pop() {
		E o = peek();
		stack[size - 1] = null;
		size--;
		return o;
	}

	public E push(E item) {
		stack[size++] = item;
		return item;
	}

	private void ensureCapacity(int size) {
		int len = stack.length;
		if (size > len) {
			int newLen = 10;
			stack = Arrays.copyOf(stack, newLen);
		}
	}

}
