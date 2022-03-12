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
		         //print() 이거 하나로 위에 있는 4개를 전부다 표현가능
		print();
//		print(3);
		
		
		
		
		
		
	}
	
	
	
//	일반
	
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
//	메소드 오버로딩으로 만들어보자
//	
	public static void print() {              //print();
		System.out.println("데이터가 없습니다.");
	}
	
	public static void print(int a) {         // print(3);  //메소드명은 신경안쓰고 인수만 신경쓰면 됨.
		System.out.println(a);
	}
	

}
