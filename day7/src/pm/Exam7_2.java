package pm;

public class Exam7_2 {

	public static void main(String[] args) {

		//static 제어자
		//static은 필드, 메서드, 이너클래스에 사용되는 제어자이다. 
		//지금까지는 클래스의 멤버를 다른 클래스에서 사용하기 위해서는 먼저 객체를 생성하고 사용해왔다.
		//객체로 사용할 수 있는 상태가 되는 멤버를 인스턴스 멤버 instance member라고 한다.
		//다시 말하면 인스턴스 멤버는 멤머 앞에 static 붙지않은 것을 말한다.
		//반면, static이 붙은 멤버들은 정적 멤버 static menber라고 부른다.
		
		//정적 멤버의 가장 큰 특징은 객체 생성 없이 '클래스명.정적멤버명' 만으로 접근가능하다.
		//정적 멤버도 객체 생성 후에도 객체를 통해서 사용할 수도 있다.
		
		//반드시 기억해야 할 static의 특징은 'static 은 객체들 간의 공유 변수의 성질을 가진다.
		
		//정적 필드는 클래스 변수라고도 부른다.
		
		
		
		
		
		Q q1 = new Q();

//		System.out.println(q1.m);  //3
//		System.out.println(q1.n);  //5
//		
//		System.out.println();
//		
//		System.out.println(Q.n);  //5
//		//System.out.println(Q.m);  //error //static만 객체 없이 접근 가능하다.
		
		
		
		
		
		Q q2 = new Q();
		
		q1.n = 7;
		q2.n = 8;
		Q.n = 9;
		
		
		System.out.println(q1.n); 
		System.out.println(q2.n); 
		
		

	}

}


class Q {
	int m = 3;
	static int n = 5; //정적 필드
	
}
