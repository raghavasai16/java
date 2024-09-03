package collectionsjava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class MapsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String  s ="batchu veera raghava";
		Map<Character,Integer> m = new LinkedHashMap<>();
		char c[] =s.toCharArray();
		for(char cs:c)
		{
			Integer k =m.get(cs);
			if(k==null)
			{
				m.put(cs, 1);
			}
			else
			{
				m.put(cs, k+1);
			}
			
		}
		System.out.println(m);
		
		String l ="ABCD BCD UI ABCH BH";
		ConcurrentHashMap<Character,LongAdder> h = new ConcurrentHashMap<>();
		
		for(char ch:l.toCharArray())
		{
			h.computeIfAbsent(ch, ca->new LongAdder()).increment();
		}
		
		System.out.println(h);

	}

}
