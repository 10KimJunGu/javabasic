package am;

public class Exam2 {

	public static void main(String[] args) {
/*
 
		//메서드 
		메서드는 클래스의 기능에 해당하는 요소로 클래스 밖에서는 함수라고 부르고 클래스 안에서는 메서드라고 부른다.
		메서드는 동작을 정의한다. 예를들면  공부하기, 춤추기, 달리기
		
		클래스 외부에서 매서드 호출
		B b = new B();
		System.out.println(b.m);
		b.work1();
		
		클래스 내부에서의 메서드 호출
		클래스의 내부에 있는 메서드 끼리는 객체를 생성하지 않고 서로를 호출하여 사용할 수 있다.
		단, 매서드 앞에 static이 붙은 static붙은 필드나 메서드만 호출할 수 있다.


		
		
		
		메서드 오버로딩
		메서드의 이름이 동일할때 입력되는 매개변수의 개수 또는 자료형에 따라 각각의 다른 메서드가
		실행된다.
		
		print();
		print(3);
		print(3,4);
		print(3, 3.14);
		
		
		
		
		생성자
		객체를 생성, 1. 반드시 클래스 명과 동일해야 한다.
		2. 리턴이 없다. 리턴형도 없다.
		개발자가 클래스에 생성자를 만들지 않으면 자동으로 컴파일시에 자바가 기본생성자를 만들어준다.
		따라서 모든 클래스에는 1개 이상의 생성자가 반드시 존재하게 된다.
		
		class A{
			A(){
			}
		}
		
		this()메서드 - 자신이 속한 클래스 내부에 다른 생성자를 호출한다.
		생성자의 내부에서만 사용, 생성자의 첫줄에만 위치해야 한다.


*/
		
		print();
		
		int a = twice(3);
		
	}





	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int a) {
		return a*2;
	}
	
}	



class C{
	C(){
		System.out.println("첫번째 생성자");
	}
	
	C(int a){
		this(); //thiss가 위에 있는 C를 호출한다.
		System.out.println("두번째생성자");
		
	}
	
//	void abc() {  // 메서드에서는 this()를 사용할 수 없다.
//		this();
//	}
}