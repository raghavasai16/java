package Practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class PRC3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		float g=98.92f;
		double k = 98762.098232;
		BigDecimal bd = new BigDecimal(k).divide(new BigDecimal(g),7,RoundingMode.UP);
		System.out.println(bd);
		
		//Files.list(Paths.get(".")).forEach(System.out::println);
	//	String text=Files.walk(Paths.get("."), 3).filter(e->e.toString().contains("txt")).toList().toString();4
		
		Scanner sc = new Scanner(new File("C:\\Users\\bvrag\\eclipse-workspace\\JulyJava\\raghava.txt"));
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
			
		}
		sc.close();
		
		Files.lines(Paths.get("./raghava.txt")).map(e->e.toLowerCase()).filter(e->e.contains("a")).forEach(System.out::println);
//		Files.write(null, null, null)
		FileWriter fw = new FileWriter(new File("C:\\Users\\bvrag\\eclipse-workspace\\JulyJava\\raghava.txt"),true);
		BufferedWriter bw = new BufferedWriter(fw);
		fw.write("Raghavajame"+"\n");
		fw.write("Sai"+"\n");
		fw.close();
		Scanner sc2 = new Scanner(new File("C:\\Users\\bvrag\\eclipse-workspace\\JulyJava\\raghava.txt"));
	
		while(sc2.hasNext())
		{
			System.out.println(sc2.nextLine());
			
		}
		sc2.close();
		
		
		
	}

}
