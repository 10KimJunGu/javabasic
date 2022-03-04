package pm;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		// 가위바위보 게임
		// (input) 가위(1), 바위(2), 보(3)중 하나를 입력하세요. >>>
		// 당신은 1입니다.
		// 컴은 1입니다.
		// 비겼습니다.
		// (input) 가위(1), 바위(2), 보(3)중 하나를 입력하세요. >>>
		// 당신은 3입니다.
		// 컴은 2입니다.
		// 당신이 이겼습니다.
		
		//난수 
//		int comp = (int)(Math.random() * 3) + 1;   // 1,2,3중 하나가 comp로 저장
//		System.out.println(comp);
		
//		비겼을때
//		comp  pers
//		  1 -  1  =  0
//		  2 -  2  =  0
//		  3 -  3  =  0	
		
//		컴승
//		pers  comp		
//		 1  -  3  =  2
//		 2  -  1  = -1
//		 3  -  2  =  1
		
//		사람승
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("가위(1), 바위(2), 보(3)중 하나를 입력하세요. >>>");
//		int pers = sc.nextInt();
//		int comp = (int)(Math.random() * 3) + 1;
//		
//		switch(pers-comp) {
//		case 0:
//			System.out.println("비겼습니다.");
//			break;
//		case 2: case -1: 
//			System.out.println("당신이 졌습니다.");
//			break;
//		case 1: case -2:
//			System.out.println("당신이 이겼습니다.");
//			break;
//		}
		
		
		
		
		
		
		
//		--------------------------------------------------------------------------------------
		
		
		
//		2개의 변수 a,b를 입력받아서 대소관계를 표시하는 프로그램을 작성하시오
//		a가 크다, b가 크다, 같다.
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자 a 입력 >>>");
//		int a = sc.nextInt();
//		System.out.print("숫자 b 입력 >>>");
//		int b = sc.nextInt();
//		
//		String max = (a == b) ? "같다" : a > b ? "a가 크다" : "b가 크다";
//		System.out.println(max);
		
		
		
//		----------------------------------------------------------------------------------------
		
		
		
		//사용자로부터 3개의 정수를 입력받아 그 중 최소값을 출력하는 프로그램을 작성하자.
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자 a 입력 >>> "); int a = sc.nextInt();
//		System.out.println("숫자 b 입력 >>> "); int b = sc.nextInt();
//		System.out.println("숫자 c 입력 >>> "); int c = sc.nextInt();
//		
//		int min = a;
//		if(b < min) min = b;
//		if(c < min) min = c;
//		
//		System.out.println("최소값 : min");
		
		
//		----------------------------------------------------------------------------------------
		
		
		
		
		//3개의 정수값을 입력받아 오름차순으로 정렬하는 프로그램을 작성하세요.
		
//		13  12  11  ->  11  12  13
//		array 사용금지
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자 a 입력 >>> "); int a = sc.nextInt();
//		System.out.println("숫자 b 입력 >>> "); int b = sc.nextInt();
//		System.out.println("숫자 c 입력 >>> "); int c = sc.nextInt();		
////		                       13 12  11     2  3  1
//		// a가 b보다 크면 a와 b를 교환   12  13  11    2  3  1
//		if (a > b) {int t = a; a = b; b = t;}
//		// b가 c보다 크면 b와 c를 교환   12  11  13    2  1  3
//		if (b > c) {int t = b; b = c; c = t;}
//		// a가 b보다 크면 a와 b를 교환   11  12  13    1  2  3
//		if (a > b) {int t = a; a = b; b = t;}
//		
//		
//		System.out.println(a + " " + b + " " + c);
		
		
		
		
		
		
		

	}

}
