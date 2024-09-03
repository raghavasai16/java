package Practice;

public class prac2 extends Prac1 {

	private String prac2;
	public prac2(String prac1) {
		super(prac1);
		// TODO Auto-generated constructor stub
	}
	public prac2(String prac1,String prac2)
	{
		super(prac1);
		this.prac2=prac2;
	}
	@Override
	public String getPracs()
	{
		super.getPracs();
		System.out.println(prac2);
		return "";
	}

}
