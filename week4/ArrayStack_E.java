package week4;

import java.util.EmptyStackException;

public class ArrayStack_E<E>{
	private E s[]; //스텍을 위한 배열
	private int top; //스택의 top 항목의 배열 원소 인덱스
	public ArrayStack_E() { //스택 생성자
		s = (E[]) new Object[1]; //초기에 크기가 1인 배열 생성
		top = -1; 
	}
	public int size() {return top+1;}
	public boolean isEmpty() {return (top == -1);}
	
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	public void push(E newItem) {
		if (size()==s.length)
			resize(2*s.length);
		s[++top] = newItem;
	}
	public E pop() {
		if (isEmpty()) throw new EmptyStackException();
		E item = s[top];
		s[top--] = null;
		if (size() > 0 && size()==s.length/4)
			resize(s.length/2);
		return item;
	}
}
