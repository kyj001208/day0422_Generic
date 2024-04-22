package day0422_Generic;

class AAA<T extends Number> {

	T num;
}

class BBB<T> {

	T type;

	public BBB(T type) {
		this.type = type;
	}

}

class CCC {

	Object type;

	public CCC(Object type) {

		this.type = type;
	}
}



public class GenericTest {
	
	void disp(CCC ccc) {
		
	}

	void disp(BBB<String>bbb) {
		
		
	}
	
	public static void main(String[] args) {
		AAA<Integer> aaa;

		BBB<String> bbb = new BBB("문자열");
		
		//Integer inbar=(Integer)bbb.type;
				
		CCC ccc=new CCC("문자열");

		Integer inVar=(Integer)ccc.type;
		
	}

}
