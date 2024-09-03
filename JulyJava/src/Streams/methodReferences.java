package Streams;

import java.util.List;

public class methodReferences {

	static void print(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> li = List.of(987,890,98763,76545);
		
		li.stream().filter(e->e%2==0).forEach(methodReferences::print);
	}

}
