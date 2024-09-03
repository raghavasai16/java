
public class enumdriver {
	
	private String name;
	private fe f;
	public enumdriver(String name)
	{
		this.name=name;
		switch(name.toLowerCase())
		{
		case "raghava":
			this.f=fe.RAGHAVA;
			break;
		case "sai":
			this.f=fe.SAI;
			break;
		case "pavan":
			this.f=fe.LAKSHMI;
			break;
		default:
			this.f=fe.LAKSHMI;
		}
		
	}
	public void getname()
	{
		System.out.println(this.name +" "+this.f);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		enumdriver ef = new enumdriver("Raghava");
		ef.getname();

	}

}
