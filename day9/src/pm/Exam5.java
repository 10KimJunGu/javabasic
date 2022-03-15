package pm;

public class Exam5 {

	public static void main(String[] args) {

		//final 메서드와  final class
		
/*		
		final 변수는 변수가 저장된 ㄱ밧이 최종값의 의미를 가진것처럼 final메서드와 final클래스도
		각각 최종 매서드 최종 클래스의 의미를 갖는다.
		최종 매서드의 의미는... 상속할 때 부모의 매서드를 오버라이딩하면 자식클래스에서는
		매서드의 기능이 변경된다. final매서드는 매서드의 기능을 변경할 수 없는 매서드
		즉, 매서드를 final 선언하면 자식 클래스에서 해당 매서드를 오버라이딩할 수 없다.
	
		
		
		총정리
		final변수는 값을 변경할 수 없고
		final매서드는 오버라이딩을 할 수 없고
		final클래스는 상속을 받을 수 없다.
		
		
		
		
		
		
		
		
		class A{
			void abc(){}
			
			final void bcd(){}
		}
		
		class B extends A{
			void abc(){ // 부모의 abc()메서드를 오버라이딩
			}
			void bcd(){} // 에러 발생. 오버라이딩 할 부모의 매서드에 final이 걸려있다.
			
		
		
		final class AAA{
		
		}
		class BBB extends AAA { // final이 선언된 클래스는 상속할 수 없다.
		
		}
		
		
		
		
		
		
		
*/		
	}

}



class AA{
	void abc(){}
	
	final void bcd(){}
}

class BB extends AA{
	void abc(){ // 부모의 abc()메서드를 오버라이딩
	}
	//void bcd(){} // 에러 발생. 오버라이딩 할 부모의 매서드에 final이 걸려있다.
}	
	
final class C{
	
}
class D extends C{
	
}
	
	
	
	
	
	
	
	