package PrimitiveData;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class July12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		String timeStamp = new SimpleDateFormat("yyMMddhh").format(new Date());
		System.out.println(timeStamp);
		LocalDate ld = LocalDate.now();
		int k=220;
		float f =34.67f;
		BigDecimal bd= new BigDecimal(k).divide(new BigDecimal(f),3,RoundingMode.UP);
		System.out.println(bd);
//		BigDecimal  bd = new BigDecimal();
	}

}
