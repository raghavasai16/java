package PrimitiveData;

public class July11 {

	public int LCM_of_twonumbers(int x,int y)
	{
		if(x<0 || y<0)
		{
			return -1;
		}
		else
		{
			int max=Math.max(x, y);
			int lcm=max;
			while(true)
			{
				boolean istrue=lcm%x==0 && lcm%y==0;
				if(istrue)
				{
					return lcm;
				}
				lcm=lcm+max;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		July11 j = new July11();
		System.out.println(j.LCM_of_twonumbers(4, 6));
		

	}

}
