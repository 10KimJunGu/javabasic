package pm;

public class Exam6 {



		
/*
		예외를 강제로 발생시키기 throw
		예를 들면 int age = -1;  실제는 예외가 아니다. 하지만 경우에 따라 
		나이는 -1살일 수가 절대 없으므로 강제로 예외로 인식시킬 필요가 있다.
		몸무게의 경우에도 500kg는 절대 있을 수가 없는 값이므로 예외로 인식시킬 필요가 있다.
		
		이럴경우 해결방법은 예외 클래스를 직접 정의하여 사용하는 것이다.
		사용자 정의 예외 클래스를 만들어보면 다른 예외들의 동작 매커니즘도 자연스럽게 이해를 할 수 있다.


*/		
		public static void main(String[] args) {
			B b = new B();
			b.bcd_1();
			b.bcd_2();
			
	}

}



class MyException extends Exception{ // 일반예외
	public MyException(){
		super();
	}
	MyException(String s){
		super(s);
	}
}

class MyRTException extends RuntimeException{ //실행예외
	MyRTException(){
		super();
	}
	MyRTException(String s){
		super(s);
	}
}


class B{
	MyException  me1 = new MyException();
	MyException  me2 = new MyException("예외 메시지 : MyException");
	
	MyRTException  mer1 = new MyRTException();
	MyRTException  mer2 = new MyRTException("예외 메시지 : MyException");
	
	void abc_1(int num) {
		try {
			if (num > 70) {
				System.out.println("정상 작동");
			}else {
				throw me1; // 예외 발생
			}
		}catch(MyException e) {
			System.out.println("예외 처리1");
			}
	}
	void bcd1() {
		abc_1(65);
	}


	void abc_2(int num) throws MyException{
		if(num > 70){
			System.out.println("정상 작동");
		}else {
			throw me1;
		}
	}
	void bcd_2() {
		try{
			abc_2(65);
		}catch(MyException e){
			System.out.println("예외 처리 2");
		}
	}
}	
