import java.util.Scanner;

public class 김종관201910335_leap_rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a=1;
				
				while(a>0) {
					
				
				Scanner scan = new Scanner(System.in);
				System.out.print("년도 입력");
				a = scan.nextInt();
				
				if(a==0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
					
				if(a%4 == 0 && a%100 != 0 || a%400==0)
					System.out.println(a + "는 윤년입니다");
				else  
					System.out.println(a + "는 평년입니다");
				}
			}

}
