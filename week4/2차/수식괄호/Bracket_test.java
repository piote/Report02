public class Bracket_test {

	public static void main(String args[]) {

		optExp opt = new optExp();
		String exp =  "(3*5)-(6/2)";

		System.out.println(exp);

		if(opt.testPair(exp))
			System.out.println("°ýÈ£ ¸ÂÀ½!");
		else
			System.out.println("°ýÈ£ Æ²¸²!!!");
	}
}