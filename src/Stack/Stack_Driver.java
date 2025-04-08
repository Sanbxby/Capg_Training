package Stack;

public class Stack_Driver {
	public static void main(String[] args) {
		Stack_Implementation stack=new Stack_Implementation();
		
		stack.display();
		stack.push(25);
		stack.push(30);
		stack.push(80);
		stack.push(21);
		stack.display();
		System.out.println("Element popped out of stack :: "+stack.pop());
		stack.display();
		System.out.println(stack.peek());
	}

}
