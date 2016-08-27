package linkedList;

import java.util.Hashtable;

public class DeleteDuplicate {

	public static void main(String[] args) {
		DeleteDuplicate dd = new DeleteDuplicate();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(3);
		Node node = head;
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
//		dd.deleteDuplicate_1(head);
		dd.deleteDuplicate_2(head);
		node = head;
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public void deleteDuplicate_1(Node head) {
		Node node = head;
		Node pre = null;
		Hashtable<Integer, Integer> table = new Hashtable<>();
		while(node != null) {
			if(table.containsKey(node.data)) {
				pre.next = node.next;
			} else {
				table.put(node.data, 1);
				pre = node;
			}
			node = node.next;
		}
		head = pre;
	}
	
	public void deleteDuplicate_2(Node head) {
		Node node1 = head;
		while(node1 != null) {
			Node node2 = node1;
			while(node2.next != null) {
				if(node2.next.data == node1.data) {
					node2.next = node2.next.next;
				} else {
					node2 = node2.next;
				}
			}
			node1 = node1.next;
		}
	}
}
