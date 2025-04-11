package Stack;

import java.util.EmptyStackException;

import Linked_List.singly_LL;

public class Stack_LL {
	private singly_LL list; //creating a ref variable
	private int pointer=-1;
	
	
	public Stack_LL() {
		list=new singly_LL(); //creating object of a singly ll class
	}
	//public boolean push(int value) {
		//pointer++;
		//return list.append(value);
	//}
	
	public boolean push(int value) {
		pointer++;
		return list.prepend(value);
	}
  // public int pop() {
	   //if(list.isEmpty()) {
		  // throw new EmptyStackException();
	   //}
	   //int data=list.returnValue(pointer);
	  // list.deleteAtLast();
	  //pointer--;
	   //return data;
   //}
	
	public int pop() {
		if(list.isEmpty()){
			throw new EmptyStackException();
		}
		int data=list.returnValue(0);
		list.delete();
		pointer--;
		return data;
		}
   
   
   
  public int peek() {
	  return list.returnValue(0);
  }
   public void display() {
	   list.display();
	   
	 
   }
}
