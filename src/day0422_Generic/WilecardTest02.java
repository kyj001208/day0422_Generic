package day0422_Generic;

import java.util.List;

public class WilecardTest02 {
	
	//리턴형에 와일드 카드 
	public static List<?> getList(){
		
		return List.of("몽","여름");
	}
	
	//리턴형 상위 제한 와일드카드: Number가 최상위
	public static List<? extends Number> getNumbers(){
		
		return List.of(1,2,3,4,5,2.5,3.5,10L); //정수, 실수 같이 사용 가능 (Number를 부모로 가지고 있는 자식 클래스 모두 허용)
	}
	
	//리턴형 하위 제한 와일드카드 : 상황에 따라 적절학 사용 필요
		public static List<? super Integer> getNumbers1(){ //하위 경우 Integer 상위 클래스로는 Number도 있지만 Object도 있다
			
			return List.of(1,2,3,4); //그러기에 리턴형이 문자열, 문자형, 실수 정수 모두 가능
		} 
		
	
	
	//Character cj;
	
	public static void main (String[]args) {
		
		List<?> list=WilecardTest02.getList();
		System.out.println(list);
		
		//변수선언에 와일드 카드 예시
		List<?> aaa=List.of(1,2,3,4,5);
		List<?> aab=List.of(1.5,2.5,3.5,4.5);
		List<?> aac=List.of("몽","여름","몽여름");
		
		
		List<? extends Number>numbers=WilecardTest02.getNumbers();
		System.out.println(numbers);
		
	}
	
}