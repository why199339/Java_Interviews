package linkedList;

public class PrintListReversely {

	public static void main(String[] args) {
		PrintListReversely pr = new PrintListReversely();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(3);
		pr.printListReversely(head);
	}

	public void printListReversely(Node head) {
		if(head != null) {
			printListReversely(head.next);
			System.out.print(head.data + " ");
		}
	}
}
