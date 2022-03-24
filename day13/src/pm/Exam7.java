package pm;

public class Exam7 {
	public static void main(String[] args) {
		
/*		
제네릭 타입 변수가 2개일때를 생각해보자 제네릭 타입 변수가 2개인 점만
제외하면 전 시간에 살펴본 변수가 1개일때와 완벽하게 동일하다.
객체를 생성할 때 사용한 실제 제네릭 타입은 순서대로 각각의 제네릭 타입변수로 치환된다.
		
		
*/		
		
	}

}

class KeyValue<K, V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
}

