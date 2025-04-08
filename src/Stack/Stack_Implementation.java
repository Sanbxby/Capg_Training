package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack_Implementation {
	
	private int[] data;
	private int pointer=-1;
	final private int initial_capacity=10;
	
	Stack_Implementation(){
		data=new int[initial_capacity];
	}

	public boolean push(int value) {
		if(isFull()) {
			data=Arrays.copyOf(data, data.length*2);
		}
	
		
			pointer++;
			data[pointer]=value;
		return true;
		}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int Rdata=data[pointer];
		pointer--;
		return Rdata;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return data[pointer];
		
	}


private boolean isFull() {
	return pointer == data.length-1;
}
private boolean isEmpty() {
	return data.length==0;
}
public void display() {
	if(isEmpty()) {
		System.out.println("EMPTY");
	}
	else {
		for(int i=0;i<=pointer;i++) {
			System.out.print(data[i]+" ");
		
		}
		System.out.println();
	}
}
}
