package Linked_List;


import Queue.Queue_LL;

public class Queue_LL_dRIVER {
	public static void main(String[] args) {
		Queue_LL q=new Queue_LL();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.display();
		System.out.println("remove element :: "+q.remove());
		q.display();
		System.out.println(q.peek());
		
		
	}

}
