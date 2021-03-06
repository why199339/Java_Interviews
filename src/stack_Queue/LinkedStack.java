package stack_Queue;

public class LinkedStack<E> {

	Node<E> top = null;
	
	public static void main(String[] args) {
		LinkedStack s = new LinkedStack();
		s.push(1);
		s.push(2);
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(E data) {
		Node<E> newNode = new Node<E>(data);
		newNode.next = top;
		top = newNode;
	}
	
	public E pop() {
		if(this.isEmpty()) {
			return null;
		}
		E data = top.data;
		top = top.next;
		return data;
	}
	
	public E peek() {
		if(isEmpty()) {
			return null;
		}
		return top.data;
	}
}

class Node<E> {
	Node<E> next = null;
	E data;

	public Node(E data) {
		this.data = data;
	}
}
