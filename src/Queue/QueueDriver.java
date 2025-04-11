package Queue;

public class QueueDriver {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.display();
	    q.delete();
	    q.display();
	    System.out.println("Size of the Queue is ::  "+q.getSize());
	    System.out.println("Visiting element :: "+q.peak());

	    }

}
