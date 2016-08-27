package linkedList;

public class FindLastKElem {

	public static void main(String[] args) {
		
	}

	public Node findElem(Node head, int k) {
		if(k < 1 || head == null) {
			return null;
		}
		Node p1 = head;
		Node p2 = head;
		for(int i=0; i<k-1; i++) {
			p1 = p1.next;
		}
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
}
