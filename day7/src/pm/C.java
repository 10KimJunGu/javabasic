package pm;

import am.A;

public class C {

	public void print() {
		
		A a = new A();
		
	
		System.out.println(a.a);
		//System.out.println(a.b);       //protected : 같은 패키지 내의 모든 클래스 + 다른 패키지의 자식 클래스에서 접근가능
		//System.out.println(a.c);          //default   : 같은 패키지 내의 모든 클래스
		//System.out.println(a.d); // error   //private이고 다른 클래스에 있으므로 에러남
		                     

				
	
	
	
	
	
}
