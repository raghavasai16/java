package OOPS;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reviews r = new Reviews("Super","Raghava");
		Reviews r1= new Reviews("Good","Sai");
		Books b = new Books(12,"Raghava");
		b.Addreview(r);
		b.Addreview(r1);
		System.out.println(b.toString());
		
		b.setRating(5);
		
		System.out.println(b.toString());

	}

}
