package testexam;

public class Exam6 {

	public static void main(String[] args) {
		
		// 문자 저장 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3'; // 숫자가 아닌 문자 3
		
		
		
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();
		
		
		// 숫자로 문자 저장

		char value4 = 65;
		System.out.println(value4);
		System.out.println();	
			
		// 유니코드로 문자 저장

		char value5 = '\u0065';
		System.out.println(value5);
		System.out.println();

		
		
		
//		형변환 type casting
//		Boolean을 제외한 기본 자료형은 서로 형을 변환할 수 있다
		
//		타입 변환을 수행할 때는 저장할 수 있는 값의 범위나 종류가 달라지므로 값이 변화 할 수 있다.
		
		int value11 = (int) 5.3;
		System.out.println(value11);
		
		
//		타입변환에는 자바가 자동으로 수행하는 '자동 타입 변환'과 개발자가 직접
//		변환을 수행해야하는 '수동 타입변환'이 있다.
//
//		크기가 작은 자료형을 큰 자료형에 대입할 때는 손실이 발생하지 않는다.
		
		float value21 = 3;   // int -> float 업캐스팅
		long value22 = 5;    // int -> long  업캐스팅
		
//		int value27 = 3.5;   // double -> int 다운캐스팅 (x)
		int value28 = (int)3.5;
//		float value29 = 7.5; // 실수의 기본은 double 형이다.
		float value30 = (float)7.5;
		
		float value31 = 2.453214321F;
		
		
		
		
//		자료형 간의 연산
//		Boolean 을 제외한 기본 자료형은 서로 연산이 가능하다.
		
		int value41 = 3 + 5;
		int value42 = 8 / 5;
		float value43 = 3.0f + 5.0f;
		double value44 = 8.0 / 5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		
//		byte data3 = data1 + data2;   // 결과가 int로 나온다. 
		int data4 = data1 + data2;
		
//		int value45 = 5 + 3.5; // 결과가 double이므로 오류
		double value46 = 5 + 3.5;
		
		double value48 = 5 / 2.0;
		byte data13 = 3;
		short data14 = 5;
		int value49 = data13 + data14;
		double value50 = data13 + data14; 
		// int를 double로 자동 형변환
		
		
		
		// quiz 1
//			main{
//1			int a = 3;
//2			{
//3				int b;
//4				b=5;
//5			}
//6			int c = 7;
//7		}
//8	}
		
//			생성시점(행번호)		삭제시점(행번호)
//a				1					7
//b				3					5
//c				6					7
		
		
		// quiz 2
//		1 byte a = 3;
//		2 byte b = 5;
//		3 byte c = 130;     // int c = 130;
//		4 byte d - a + b;   // int d = a+b;
//		5 long e = 100;
//		6 float f = 3.5;	// float f = 3.5F;
		
		
		
		
		
		// quiz 3
//		1 System.out.println((int)5.6 + 3.5);
//		2 System.out.println((int)5.6 + (int)3.5);
//		3 System.out.println((int)(5.6 + 3.5));
//		4 System.out.println(7/4);
//		5 System.out.println((double)3/2);
//		6 System.out.println((double)(7/4));
		
		
		
		
		
		
		
	}

}
