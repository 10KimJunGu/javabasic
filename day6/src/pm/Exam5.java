package pm;

public class Exam5 {

	public static void main(String[] args) {

//		//Method Overloading
//		
//		printa(); // 인수가 없을때
//		printb(3); // 인수가 1개인데 int형		
////		printc(5.8); // 인수가 1개인데 double형		
////		printd(2,5); // 인수가 2개일때
//				
		
		
		
//		print(); // 하나의 메서드 명으로 인수의 개수와 형에 다라 동작을 다르게 한다.	
		print();
//		print(3);
		
		
		
		
		
		
	}
//	
//	public static void printa() {
//		System.out.println("데이터가 없습니다.");
//	}
//	
//	public static void printb(int a) {
//		System.out.println(a);
//	}
//	
//	
//	
//	
//	
//	
	public static void print() {              //print();
		System.out.println("데이터가 없습니다.");
	}
	
	public static void printa(int a) {         // print(3);
		System.out.println(a);
	}
	
	public static void printa(int b, int c) {
		System.out.println(c);
	}
}
