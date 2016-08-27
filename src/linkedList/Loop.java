package linkedList;

public class Loop {

	public static void main(String[] args) {
		Loop l = new Loop();
		Node node1 = new Node(3);
		Node node2 = new Node(2);
		Node node3 = new Node(0);
		Node node4 = new Node(-4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;
		System.out.println(l.isLoop(node1));
		System.out.println(l.findLoopPort(node1).data);
	}

	public boolean isLoop(Node head) {
		if(head == null) {
			return false;
		}
		Node fast = head;
		Node slow = head;
		while(fast != null || fast.next != null) {
			slow = slow.next;
			fast = fast.next;
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	public Node findLoopPort(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		if(fast == null || fast.next == null) {
			return null;
		}
		slow = head;
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
