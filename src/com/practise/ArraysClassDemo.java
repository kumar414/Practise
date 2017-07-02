package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysClassDemo {
	
	public static void main(String [] args)
	{
	  int []a={1,2,3,4,5};
	  List<Integer> lst=new ArrayList<Integer>();
	  for(int i=0;i<a.length;i++)
	  {
		  lst.add(a[i]);
	  }
	  System.out.println(lst);
	  Integer []d=lst.toArray(new Integer[lst.size()]);
	  System.out.println(d[0]);
	 
	  
	  
	  
	  
	}

}
