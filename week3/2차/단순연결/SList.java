import java.util.NoSuchElementException;
public class SList <E extends Comparable<E>>{

	protected Node head; // 연결리스트의 첫 노드 가리킴
	private int size;
	public Node getHead() {return head;}
	public void setGead(Node n) {head= n;}
	public void SList() {
		head = null;
		size = 0;
	}
	public int size() {return size;}
	public boolean isEmpty() {return size == 0;}
	
	public void insertFront(E newItem){
		head = new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
	public void delateFront() {
		if(size == 0) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	public void deleteAfter(Node p) {
		if(p==null) throw new NoSuchElementException();
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}
	public int search(E target) { 
		Node p=head;
		for(int k=0;k<size;k++) {
			if(target==p.getItem()) return k;
			p = p.getNext();
		}
		return -1;
	}
	public void print() {
		for(Node p = head;p!=null;p=p.getNext())
			System.out.print(p.getItem()+"\t ");
		System.out.println();
	}
}	
