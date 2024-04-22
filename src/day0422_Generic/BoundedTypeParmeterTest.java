package day0422_Generic;

//K extends String : 자식 클래스가 존재하지 않는데 제네릭 적용은 쓸모 없음
class Box<V extends Number> {

	private String kind;
	private V value;

	void display() {

		System.out.println(kind + " 박스 " + value + "개");
	}

	public Box(String kind, V value) {
		this.kind = kind;
		this.value = value;
	}

}

public class BoundedTypeParmeterTest {

	public static void main(String[] args) {

		Box<Number> box = new Box("사과", 1); //생성시 <>를 사용하는냐 안하는냐에 따라 다르다
		box.display();
		
		//Box<Integer> box1 = new Box<>("배", 3.5);//선언은 <Integer>로 진행하였으나 생성자 구간에 <>가 없을 경우 에러가 뜨지 않으며 선언은과 생성자가 다름
		//box1.display();						  // <>가 붙을 경우 바로 오류가 뜨며 불가능해짐
		
		Box<Double> box2 = new Box("체리", 3.5);
		box2.display();
		
		//Double pNum=3.5;
		//Integer=num(Integer)pNum; //Wrapper 클래스경우 캐스팅 불가
		
		Integer n1=10;
		//Double n2=n1; 
		
		int m2=10;
		double m1=m2; 
	
		
	}

}
