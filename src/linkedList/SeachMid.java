package linkedList;

public class SeachMid {

	public static void main(String[] args) {
		SeachMid sm = new SeachMid();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		Node node = sm.searchMid(head);
		System.out.println(node.data);
	}

	public Node searchMid(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null & fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
