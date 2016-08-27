package linkedList;

public class deletNode {

	public static void main(String[] args) {

	}

	public boolean deleteNode(Node n) {
		if(n == null || n.next == null) {
			return false;
		}
		n.data = n.next.data;
		n.next = n.next.next;
		return true;
	}
}
