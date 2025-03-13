package customlinkedlist;

public class Main {
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst(1);
		list.addFirst(2);
		list.display();
		list.addFirst(3);
		list.display();
		list.addLast(0);
		list.display();
		list.insertAt(100, 0);
		list.display();
		list.insertAt(100,1);
		list.display();
	}

}
