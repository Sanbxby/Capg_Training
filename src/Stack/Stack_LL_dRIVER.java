package Stack;

import Linked_List.singly_LL;

public class Stack_LL_dRIVER {
	public static void main(String[] args) {
		Stack_LL stack=new Stack_LL();
		  
		
		stack.push(34);
		stack.push(42);
		stack.push(65);
		stack.push(69);
		
		stack.display();
		
		System.out.println("popping one element out :: "+ stack.pop());
		System.out.println("Visiting the element :: "+ stack.peek());
		
	}
}
