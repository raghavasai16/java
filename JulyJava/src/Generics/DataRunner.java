package Generics;

public class DataRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		d.addElemenet("Raghava");
		d.addElemenet("Sai");
		System.out.println(d.toString());
		Data i = new Data();
		i.addElemenet(123);
		i.addElemenet(145);
		System.out.println(i.toString());
	}

}
