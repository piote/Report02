package week4;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack_E<String> stack = new ArrayStack_E<String>();
		
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
	}

}
