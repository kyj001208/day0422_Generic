package day0422_Generic;

import java.util.function.Function;

//일반 메서드
class GeneirMethod01 {
	String str;

	void disp(String str) {

		System.out.println(str);
	}

	// 메서드 내로 타입파라미터가 적용
	public <T> T getFirstElement(T[] arr) {

		return (arr == null || arr.length == 0) ? null : arr[0];

	}

	public <T1, T2> void print(T1 t1, T2 t2) {

		System.out.println(t1 + ":" + t2);
	}
}

//static  메서드 예제

class GeneirMethod02 {// 클래스 이름으로 다이렉트로 접근(객체 생성 x)

	public static <T> T getFirstElement(T[] arr) {

		return (arr == null || arr.length == 0) ? null : arr[0];

	}

	public static <T1, T2> void print(T1 t1, T2 t2) {

		System.out.println(t1 + ":" + t2);
	}
}


public class GenericMethodTest {

	public static void main(String[] args) {

		GeneirMethod01 obj = new GeneirMethod01();

		Integer[] arr = { 10, 2, 3 };

		Integer firstElement = obj.getFirstElement(arr);
		int num = firstElement;
		System.out.println(firstElement);

		obj.print(10, 3.14);

		// Double []arr2=new Double[] {3.14,5.0};

		Double num2 = GeneirMethod02.getFirstElement(new Double[] { 3.14, 5.0 });
		System.out.println(num2);

		GeneirMethod02.print(null, null);

	}

}
