package day0422_Generic;

interface Shape {

	void drow(); // 추상 메서드

}

class Circle implements Shape {

	@Override
	public void drow() {
		System.out.println("원");

	}

}

class Ractangle implements Shape {

	@Override
	public void drow() {
		System.out.println("사각형");

	}

}
//도형 팩토리 인터페이스

interface ShapFactory {

	Shape crateShape();
}

class CirclaFactory implements ShapFactory {

	@Override
	public Shape crateShape() {

		return new Circle();
	}

}

class RectangleFactory implements ShapFactory {

	@Override
	public Shape crateShape() {

		return new Ractangle();
	}

}


class ShapeFactoryCreator{
	public static ShapFactory createFactory(Class<? extends Shape> clazz) {
		
		if(clazz.equals(Circle.class)) {
			
			return new CirclaFactory();
			
			
		}else if(clazz.equals(Ractangle.class)) {
			
			return new RectangleFactory();
			
			
		}
		return null;
		
	}
	
}

public class WildcardTest03 {

	public static void main(String[] args) {

		ShapeFactoryCreator.createFactory(Circle.class);
	}

}