package Generics;

import java.util.ArrayList;
import java.util.List;

public class Data<T> {
	
	static<T extends List> void doubleElements(T list)
	{
	 list.add(list);
	}
	public ArrayList<T> a = new ArrayList<T>();
	
//	ArrayList<Integer>
	
	public void addElemenet(T el)
	{
		a.add(el);
	}
	public void deleteElement(T index)
	{
		a.remove(index);
	}
	public String toString()
	{
		return a.toString();
	}

}
