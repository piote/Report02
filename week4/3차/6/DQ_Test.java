package week4;
 
public class DQ_Test {

	public static void main(String args[]) {
			char deletedItem;
			DQueue DQ = new DQueue();

			DQ.insertFront('A');
			DQ.printDQueue();

			DQ.insertFront('B');
			DQ.printDQueue();

			DQ.insertFront('C');
			DQ.printDQueue();
		
			deletedItem = DQ.deleteFront();
			if(deletedItem != 0)
			System.out.println("Front delted Item : " + deletedItem);
			DQ.printDQueue();

			deletedItem = DQ.deleteRear();
			if(deletedItem != 0)
				System.out.println("Rear delted Item : " + deletedItem);
			DQ.printDQueue();

			DQ.insertRear('D');
			DQ.printDQueue();

			DQ.insertFront('E');
			DQ.printDQueue();

			DQ.insertFront('F');
			DQ.printDQueue();

		}

}