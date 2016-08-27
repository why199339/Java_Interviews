package linkedList;

public class MylinkedList {

	Node head = null;

	public static void main(String[] args) {
		MylinkedList list = new MylinkedList();
		list.addNode(5);
		list.addNode(3);
		list.addNode(1);
		System.out.println("listLen = " + list.length());
		System.out.println("before order"); 
		list.printList();
		list.orderList();
		System.out.println("after order"); 
		list.printList();
	}

	public void addNode(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public boolean deleteNode(int index) {
		if (index < 1) {
			return false;
		}
		if (index == 1) {
			head = head.next;
			return true;
		}
		int i = 1;
		Node preNode = head;
		Node curNode = head.next;
		while (curNode != null) {
			if (i == index) {
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return false;
	}
	
	public int length() {
		int length = 0;
		Node node = head;
		while(node != null) {
			length ++;
			node = node.next;
		}
		return length;
	}
	
	public Node orderList() {
		Node nextNode = null;
		Node curNode = head;
		int temp = 0;
		while(curNode.next != null) {
			nextNode = curNode.next;
			while(nextNode != null) {
				if(curNode.data > nextNode.data) {
					temp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;
		}
		return head;
	}
	
	public void printList() {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
}
