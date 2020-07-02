package week4;

public class Node<E> {
	private E item;
	private Node<E> next;
	public Node(E newitem, Node<E> node) {
		item = newitem;
		next = node;
	}
	//get 메소드들과 set 메소드들
	public E getItem() {return item;}
	public Node<E> getNext() {return next;}
	public void  setItem(E newitem) {item = newitem;}
	public void setNext(Node<E> newNext) {next = newNext;}
}

