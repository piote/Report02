import java.util.Scanner;

public class 김종관201910335_gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in, out = 0;
		
		System.out.print("숫자 입력");
		
		Scanner scan = new Scanner(System.in);//스케너 
		
		in = scan.nextInt();
		
		for (int i = 1; i<10; i++) {
			out = in * i; 
			System.out.println( in + " X " + i + " = " + out);
		}
		
	}

}
