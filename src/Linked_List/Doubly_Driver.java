package Linked_List;

public class Doubly_Driver {
	public static void main(String[] args) {
		Doubly_LL list=new Doubly_LL();
		list.append(10);
		list.append(30);
		list.append(60);
		list.append(90);
		list.display();
		list.prepend(70);
		list.display();
		list.insertInMiddle(50, 3);
		list.display();
		list.delete();
		list.display();
		list.deleteAtLast();
		list.display();
		list.deletAtMiddle(1);
		list.display();
		list.append(45);
		list.display();
		 System.out.println("Size of LinkedList :: "  +list.getSize());
		 System.out.println("Element found at position :: "  +list.searchElement(60));
		 list.displayReverse();
	
			
	}

}
