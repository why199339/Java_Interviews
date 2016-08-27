package linkedList;

public class ReverseList {

	public static void main(String[] args) {
		ReverseList rl = new ReverseList();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(3);
		Node node = rl.reverseIteratively(head);
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public Node reverseIteratively(Node head) {
		Node reversedHead = head;
		Node prev = null;
		Node node = head;
		while(node != null) {
			Node next = node.next;
			if(next == null) {
				reversedHead = node;
			}
			node.next = prev;
			prev = node;
			node = next;
		}
		return reversedHead;
	}
}
