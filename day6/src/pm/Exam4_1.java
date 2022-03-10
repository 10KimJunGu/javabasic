package pm;

public class Exam4_1 {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.printFieldValue();

	}

}

class B{
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	
	void printFieldValue() {
		System.out.println(m1);  //필드는 초기화 하지 않아도 값이 강제로 초기화  //false
		System.out.println(m2);  // 0
		System.out.println(m3); // 0.0
		System.out.println(m4); //null
		
	}
	
	void printLocalValue() {
		int k;
//		System.out.println(k); //지역변수를 초기화 하지 않으면 오류가 발생
		
		
		//자바 문법을 서로 얽히고 설켜 있어서 하나를 설명하다 보면 아직 배우지 않은
		//뭔가를 먼저 얘기해야 할 때가 있다. 지금은 잘 이해가 안되더라도
		// 다른부분을 공붛나느 과정에서 쉽게 이해되는 일이 많다.
	}
	
}