package am;

public class Exam3 {

/*	
	
	Quiz 1 class D를 만드세요
	
	Quiz 2 int[]객체를 입력받아서 그 배열의 모든 원소를 합하여 결과를 리턴하여
	출력하는 arraySum() 메서드를 만드세요(class F)
	
	
	
	
	D d = new D();
	
	d.print();       ->입력값이 없습니다.
	d.print(3);        -> 정수 입력 값 : 3
	d.print(5.8);       -> 실수 입력 값 : 5.8
	d.print("안녕");      -> 문자열 입력 값 : 안녕
	
	
	
	
	
*/	
	
	public static void main(String[] args) {
			
//		D d = new D();
//		
//		d.print();       //->입력값이 없습니다.
//		d.print(3);        //-> 정수 입력 값 : 3
//		d.print(5.8);       //-> 실수 입력 값 : 5.8
//		d.print("안녕");      //-> 문자열 입력 값 : 안녕
		
		F f = new F();
		
		int[] data1 = new int[] {1,2,3};
		int[] data2 = {1,2,3};
		System.out.println(f.arraySum(data1));
		System.out.println(f.arraySum(data2));
		
//		System.out.println(f.arraySum({1,2,3}));
		System.out.println(f.arraySum(new int[] {1,2,3}));
		
		
	}

}

class F{
	int arraySum(int[] array) {
		int sum = 0;
		for(int each : array) {
			sum += each;
		}
		return sum;
	}
}

class D{
	void print(){
		System.out.println("입력값이 없습니다.");

	}
	void print(int a){
		System.out.println("정수 입력값 : " + a);
		
	}
	void print(double a){
		System.out.println("실수 입력값 : " + a);

	}
	void print(String a){
		System.out.println("문자열 입력값 : " + a);

	}
}