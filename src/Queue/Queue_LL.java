package Queue;

import java.util.EmptyStackException;

import Linked_List.singly_LL;

public class Queue_LL {
	
		private singly_LL list; //creating a ref variable
		private int pointer=-1;
		
		
		public Queue_LL() {
			list=new singly_LL(); //creating object of a singly ll class
		}
		
		public boolean insert(int value) {
			pointer++;
			list.append(value);
			return true;
		}
		public int remove() {
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
	
	


