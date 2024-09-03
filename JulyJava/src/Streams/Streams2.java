package Streams;

import java.util.List;

public class Streams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = List.of(12,13,1,53,646,74,34,656,235);
		
		System.out.println("Even numbers....");
		
		
		//for filter we are using predicate interface its nothing a method having on implementation that returns only true
		//so what ever we are writing the logic in filter its creating own method and returing bolean value
		//Similar for forEach it is implements by consumer
		
		li.stream().filter(e->e%2==0).forEach(e->System.out.print("\t"+ e));
		
		System.out.println("Max Even Number");
		
		int i =li.stream().filter(e->e%2==0).min((number1,number2)->Integer.compare(number1,number2)).orElse(0);
		
		System.out.println(i);

	}

}
