package pm;

public class Exam6 {

	public static void main(String[] args) {
/*
제네릭을 사용하면 모든 타입의 상품을 저장할 수도 있으면서도 잘못된 캐스팅을 할때
문법 오류를 발생시키는 문제를 사전에 예방할 수 있다.

 제네릭 클래스와 제네릭 인터페이스 정의

public class MyClass<T>{
	private T t;
	public T get(){
		return t;
	}
	
	public void set(T t){
		this.t = t;
	}
}

public interface MyInterFace<K, V>{
	public abstract void setKet(K k);
	public abstract void setValue(V v);
	public abstract K getKet();
	public abstract V getValue();
}


제네릭 클래스인 MyClass<T>는 제네릭 타입 변수 1개를 갖고있다.
이 제네릭 타입은 필드 타입 getter메서드의 리턴타입 setter메서드의 입력타입에
사용됐다.

제네릭 인터페이스인 MyInterface<K, V>는 2개의 제네릭 타입변수를 갖고 있고
각각 setter와 getter메서드의 입력과 리턴 타입으로  사용되고 있다.

제네릭 클래스라고 해도 역시 클래스의 객체 생성 등의 기능을 모두 갖고 있다.






 */

	}

}


public class MyClass<T>{
	private T t;
	public T get(){
		return t;
	}
	
	public void set(T t){
		this.t = t;
	}
}

public interface MyInterFace<K, V>{
	public abstract void setKet(K k);
	public abstract void setValue(V v);
	public abstract K getKet();
	public abstract V getValue();
}
