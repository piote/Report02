package week3;

public class Node <E>{
	private E item;
	private Node next;
	
	public Node(E newItem, Node p) {
		item = newItem;
		next = p;
	}
	//get 메소드와 set메소드
	public E getItem() {return item;}
	public Node getNext() {return next;}
	public void setItem(E newitem) {item = newitem;}
	public void setNext(Node newNext) {next = newNext;}
}
