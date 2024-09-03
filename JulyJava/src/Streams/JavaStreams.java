package Streams;
import java.util.*;
public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al =  List.of(1,4,6,7,8889,76);
		PrintList(al);
		
		
		al.stream().filter(e->e%2==1).forEach(e->System.out.print(e));
		
		System.out.println("SumSquares"+al.stream().sorted().map(e->e*e).reduce(0,(num1,num2)->num1+num2));
		
		
		List<String> l =List.of("raghava","Sai","pavan");
		
		l.stream().forEach(e->System.out.println(e+"\t"+e.length()));
		
		
			
		int k=al.stream().reduce(0,(number1,number2)->number1+number2);
		System.out.println(k);
	}
	static void PrintList(List<Integer> li)
	{
		li.stream().forEach(el ->System.out.println(el));
	}

}
