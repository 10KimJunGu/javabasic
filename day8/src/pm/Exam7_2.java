package pm;

public class Exam7_2 {

	public static void main(String[] args) {

		
		X x = new X();
		
		
		

	}

}


class V{
	V(){
		System.out.println("V생성자");
	}
}

class X extends V{
	X(){
		super();
		System.out.println("X생성자");
	}
}