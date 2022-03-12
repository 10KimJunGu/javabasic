package pm;

public class Exam4_2 {

	public static void main(String[] args) {
		
		//메서드
		// 메서드는 클래스의 기능에 해당하는 요소다.
		// 사람 클래스라면 먹기, 잠자기, 공부하기...
		// 자동차 클래스라면 앞으로가기, 후진하기, 유턴하기...
		//메서드는 관례로 소문자로만 만든다.
		
		
		//     제어자         반환타입 메서드명(인수a,인수 b){
		//}
		// public static int sum(int a, int b){
		//}
		//입력값으로 int형 a,b 2개를 입력받아서 처리한다.
		
		
		
		
		//여러가지 형태의 반환타입
		
		// 1. input도 없   고 return도 없다
		// void print(){
		// System.out.println("HI");
		// }   // 리턴타입이 void(리턴이 없다.), 인수도 없다.
		
		//2. input은 없고 return은 있다.
		//int print(){
		//	   return 0;
		// }   // 리턴타입이 void(리턴이 없다.), 인수도 없다.
		
		//3. input은 있고 return은 없다
		// void print(String name){
		//       System.out.println(name);
		// }                                            //void가 있으면 항상 return은 없는 것이다.
		
		//4. input도 있고 return도 있다.
		// String print(String name){
		//        return
		// }
		
		
		//메서도 호출
		//매소드를 사용하려면 먼저 객체를 생성해야 한다.
		// A a = new A();
		// a.method();


		C c = new C();
		c.print();
		
		 int k = c.data();
		 System.out.println(k);
		 double result = c.sum(3,  5.2);
		 System.out.println(result);
		 c.printMonth(5);
		 c.printMonth(13);
		

	}

}



class C{
	//no input no output                return이 없으면 output도 없다.
	void print() {
		System.out.println("안녕");
	}
	
	
	// no input yes output
	int data() { //int return의 타입
		return 3;
	}
	
	// yes input yes output
	double sum(int a, double b) {  //return 타입
		return a + b;  // a+b의 결과가 double로 나간다.
	}
	
	
	void printMonth(int m) { //void리턴이 없다.
		if(m <=0 || m > 12) {
			System.out.println("월을 잘못 입력하셨습니다.");
			return; //메서드를 빠져나가기 위한  return
		}
		System.out.println(m + "월입니다.");
	}
	
	
}


