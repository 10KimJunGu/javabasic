package pm;

public class Exam6 {

	public static void main(String[] args) {
		
		// 가변길이 메서드
		// 매서드 오버로딩은 입력변수의 개수 혹은 자료형에 따라서 구분된다.
		// 만약 입력 변수로 1~100사이의 불특정 갯수로 입력 들어오게되면
		// 매서드도 100개를 만들어야 한다.
		// 이것을 간단하게 할 수 있는 방법이 바로 가변길이 매개변수를 사용하는 매서드이다.
		
//		sum(1);
//		sum(1,2);
//		sum(1,2,3);
//		
//	
//	}
//	
//	public static void sum(int a) {
//		
//	}
//	public static void sum(int a, int b) {
//		
//	}
//	public static void sum(int a, int b, int c) {    //귀찮으니까 이렇게 만들지말자
//		
//	}

		
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method2("안녕","방가");
		method2("땡큐","배리","감사");
		method2();
		
	}
	                                                   //void이 있으면 return은 없다.
	public static void method1(int...values) {         //static은 객체를 찍지않고도 서로 접근이 가능하다.
		System.out.println("길이  : " + values.length);  // ...은 가변길이 메서드다.
		
		for(int each : values) {
			System.out.print(each + " ");
		}
		System.out.println();
	}
	
	
	
	public static void method2(String...values) {
		System.out.println("길이  : " + values.length);
		
		for(String each : values) {
			System.out.print(each + " ");
		}
		System.out.println();
	}
	
	
}
