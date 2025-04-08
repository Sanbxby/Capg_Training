package Linked_List;



public class Doubly_LL {
	private Node head;
	private Node tail;
	private int size;

	private class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
		}
	}
	public int getSize() {
		Node temp=head;
		int count=0;
		if (isEmpty()) {
			return 0;
		}
		else if(head==tail) {
			return 1;
		}
		else {
			while(temp!=null) {
				temp=temp.next;
				count++;
			}
		}
		return count;
		
	}

	public boolean isEmpty() {
	return head == null && tail == null;
	}
	
	public boolean append(int value) {
		Node node=new Node(value);
		
		if(isEmpty()) {
			head=node;
			tail=node;
		}else
		{
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
		size++;
		return true;
	}
	public boolean prepend(int value) {
		Node node=new Node(value);
		
		if(isEmpty()) {
			head=node;
			tail=node;
		}else
		{
			node.next=head;
			head.prev=node;
			head=node;
		}
		size++;
		return true;
	}
	public boolean insertInMiddle(int value,int index) {
		if(index<=0) {
			return prepend(value);
		}
		else if(index>=size) {
			return append(value);
		}
		else {
			Node node= new Node(value);
			Node temp=head;
			Node prev=null;
			int i=0;
			while(i!=index) {
				prev=temp;
				temp=temp.next;
				i++;
			}
			prev.next=node;
			node.next=temp;
			size++;
			return true;
			}
		}
	public boolean delete() {
		if (isEmpty()) {
			return false;
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}
		else {
			head=head.next;
			}
		return true;
	}
	public boolean deleteAtLast() {
		if (isEmpty()) {
			return false;
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}
		else {
			Node temp=head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
		}
		return true;
	}
		public boolean deletAtMiddle(int index) {
			if (isEmpty()) {
				return false;
			}
			else if(head==tail) {
				head=null;
				tail=null;
			}
			else if(index==0) {
				delete();
			
			}
			else {
				Node temp=head;
				Node prev=null;
				int i=0;
				
				while(i!=index) {
					prev=temp;
					temp=temp.next;
					i++;
				}
				prev.next=temp.next;
			}
			return true;
	}
		public int searchElement(int data) {
			Node current=head;
			if (isEmpty()) {
				return -1;
			}
			else if(head==tail) {
				head=null;
				tail=null;
			}
			else {
				for(int i=0;i<getSize();i++) {
					if(current.value==data) {
						return i;
					}
					current=current.next;
				}
		
			}
			return -1;
		}
		public void displayReverse() {
			Node temp=tail;
			while(temp!=null) {
				System.out.print(temp.value+"\t");
				temp=temp.prev;
			}
			System.out.println();
		}
	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp == tail ? temp.value : temp.value + " <-> ");
			temp = temp.next;
		}
		System.out.println();
	}
}
