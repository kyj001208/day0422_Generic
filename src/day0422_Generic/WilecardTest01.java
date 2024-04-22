package day0422_Generic;

import java.util.ArrayList;
import java.util.List;

public class WilecardTest01 {
	
	//Unbounded Wildcards
	
	public static void printList(List<?>list) {
		
		for(Object element:list) {
			
			System.out.println(element);
		}
		
	}
	
	// Upper Bounded Wildcards : 하위클래스가 Integer인 클래스들 
	
	public static double sumOfList(List<? extends Number>list) {//Number(부모)를 상속한 모든 (자식)클래스 허용 
		double sum=0;
		for(Number arr:list) {
		sum += arr.doubleValue();
		}
		return sum;
	}
	
	
	// Lower Bounded Wildcards
	
	public static void addNumbers(List<? super Integer>list) {
		
		for(int i=1; i<=10; i++) {
			
			list.add(i);
			
		}
	}

	public static void main(String[] args) {
		
		List<Integer> ints=List.of(1,2,3); //자바 9버전에서 사용
		List<Double> doubles=List.of(1.0,2.5,3.2);
		List<String> strs=List.of("안녕","몽아","여름아");
		WilecardTest01.printList(ints);
		WilecardTest01.printList(doubles);
		WilecardTest01.printList(strs);
		
		double sum=sumOfList(ints);
		System.out.println(sum);
		
		sum=sumOfList(doubles);
		System.out.println(sum);

		List<Integer> intlist=new ArrayList<Integer>();
		WilecardTest01.addNumbers(intlist);//정수 1부터 10까지를 추가
		
		System.out.println(intlist);
		
		
		List<Number> numList=new ArrayList<Number>();
		WilecardTest01.addNumbers(numList);//정수 1부터 10까지를 추가
		
		System.out.println(numList);
		

		//List<Double> doubleList=new ArrayList<Double>(); //int형의 부모만 가능하기에 double 불가능
		//WilecardTest01.addNumbers(doubleList);	
		
		
		
	}

}
