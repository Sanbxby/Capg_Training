package Linked_List;

public class Circular_Driver {
	public static void main(String[] args) {
		 Circular_LL list=new Circular_LL();
		 list.append(10);
		 list.append(20);
		 list.append(30);
		 list.append(40);
		 list.display();
		 list.prepend(90);
		 list.display();
		 list.insertInMiddle(70, 2);
		 list.display();
		 list.delete();
		 list.display();
		 list.deleteAtLast();
		 list.display();
		 list.deletAtMiddle(2);
		 list.display();
		 System.out.println("Size of LinkedList "  +list.getSize());


}
}
