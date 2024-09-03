package PrimitiveData;

public class July10 {

	public  static String conversion_hexa(int decimal)
	{
		int num=decimal;
		String res="";
		char numbers[]={'A','B','C','D','E','F'};
		while(num>0)
		{
			int rem=num%16;
			num=num/16;
			if(rem<=9)
			{
				res=res+String.valueOf(rem);
			}
			else
			{
				int getChar=rem-9;
				res=res+String.valueOf(numbers[getChar-1]);
			}
			
			
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To get max and minimum values of the data type we will have the wrapper classes
		
		String res=conversion_hexa(16);
		StringBuilder sb = new StringBuilder(res);
		System.out.println(sb.reverse());
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MAX_VALUE);
		boolean k=true;
		if(k)
		{
			System.out.println("p");
		}
		

	}

}
