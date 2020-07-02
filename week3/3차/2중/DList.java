import java.util.NoSuchElementException;

public class DList <E>{
	protected DNode head, tail;
	protected int size;
	public DList() { //생성자
		head = new DNode (null, null, null);
		tail = new DNode (null, head, null);//tail의 이전노드를 head로
		head.setNext(tail);    //head의 다음노드를 tail로
		size = 0;
	}
	//삽입 , 삭제 연산을 위한 메소드 선언
	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem, t, p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}
	public void insertAfter(DNode p, E newItem) {
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}
	public void delete(DNode x) {
		if(x== null) throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}
	public void print() {
		if (size > 0)
			for (DNode p = head.getNext(); p != tail; p = p.getNext())
				System.out.print(p.getItem()+"\t ");
		else
			System.out.println("리스트 비어있음");
		System.out.println();
	}
}
