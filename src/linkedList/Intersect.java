package linkedList;

public class Intersect {

	public static void main(String[] args) {
		Intersect it = new Intersect();
		Node head1 = new Node(1);
		Node head2 = new Node(2);
		Node head3 = new Node(3);
		Node head4 = new Node(4);
		Node node1 = new Node(2);
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		node1.next = head3;
		System.out.println(it.isIntersect(head1, node1));
		System.out.println(it.getFirstMeetNode(head1, node1).data);
	}

	public boolean isIntersect(Node h1, Node h2) {
		if (h1 == null || h2 == null) {
			return false;
		}
		Node n1 = h1;
		Node n2 = h2;
		while (n1.next != null) {
			n1 = n1.next;
		}
		while (n2.next != null) {
			n2 = n2.next;
		}
		return n1 == n2;
	}

	public Node getFirstMeetNode(Node h1, Node h2) {
		Node t1 = h1;
		Node t2 = h2;
		int len1 = 1;
		int len2 = 1;
		while (t1.next != null) {
			t1 = t1.next;
			len1++;
		}
		while (t2.next != null) {
			t2 = t2.next;
			len2++;
		}
		if (t1 != t2) {
			return null;
		}
		Node n1 = h1;
		Node n2 = h2;
		if (len1 > len2) {
			for (int i = 0; i < len1 - len2; i++) {
				n1 = n1.next;
			}
		} else {
			for (int i = 0; i < len2 - len1; i++) {
				n2 = n2.next;
			}
		}
		while (n1 != n2) {
			n1 = n1.next;
			n2 = n2.next;
		}
		return n1;
	}
}
