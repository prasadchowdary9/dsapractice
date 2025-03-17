package customlinkedlist;

public class LL {

	private Node head;
	int size = 0;

	public LL() {
		this.size = 0;
	}

	private class Node {

		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

	}

	public void addFirst(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			return;
		}
		node.next = head;
		head = node;

	}

	public void addLast(int value) {
		if(head==null) {
			addFirst(value);
			return;
		}
		Node node = new Node(value);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next=node;
	

	}

	public void insertAt(int value, int index) {
		if (index == 0) {
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        newNode.next = temp.next;
        temp.next = newNode;

	}
public void dummy(){}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value+" => ");
			temp = temp.next;
		}
		System.out.println("END");

	}

	public int deleteFirst() {
		return 0;

	}

	public int deleteLast() {
		return 0;

	}

	public int deleteAt() {
		return 0;

	}

	public int size() {
		return size;
	}

	public void reverse() {

	}

}
