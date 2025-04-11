package Queue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Queue {
	
	int data[];
	int pointer=-1;
	int initial_capacity=10;
	
	
	Queue(){
		data = new int[initial_capacity];
	}
	
	Queue(int size) {
		data=new int[size];
	}
	public boolean insert(int value) {
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
	
	public boolean isFull() {
		return data.length-1==pointer;
	}
	private boolean isEmpty() {
		return data.length==0;
	}
	
	public boolean delete() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		for(int i=1;i<=pointer;i++) {
			data[i-1]=data[i];
		}
		pointer--;
		return true;
		
	}
	public int getSize() {
		return pointer+1;
	}
	
	public int peak() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return data[pointer];
	}
	public void display() {
		for(int i=0;i<=pointer;i++) {
			System.out.print(data[i]+" ");
		
		}
		System.out.println();
	}
	}


