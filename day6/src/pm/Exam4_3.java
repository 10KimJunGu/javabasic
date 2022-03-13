package pm;

public class Exam4_3 {

	public static void main(String[] args) {
		
		// 클래스 내부에서 메서드 호출하기
		// 클래스 내부에 있는 메서드끼리는 객체를 생성하지 않고도 서로 호출할 수 있다.
		// 필드 역시 클래스 내부의 모든 매서드 안에서 객체를 생성하지 않고 사용할 수 있다.
		// 조건, 메서드 앞에 static이 붙어있을 경우만 호출할 수 있다.
		
		print();    //1
		
		int a = twice(3);    //2
		System.out.println(a);
		
		double b = sum(a, 5.8);    //3
		System.out.println(b);

		

	}

	
	public static void print() {    //1
		System.out.println("안녕");  //안녕
	}
	
	public static int twice(int k) {    //2
		return k*2;  //6
	}
	
	public static double sum(int m, double n) {    //3
		return m + n;  //11.8
	}
	
	
	//클래스안에 있는 3개의 다른 메소드
}
