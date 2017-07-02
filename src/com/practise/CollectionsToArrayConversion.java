package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsToArrayConversion {
	
	public static void main(String [] args)
	{
		int [] a={11,12,3,14,5};
		System.out.println(a);
		Set<Integer> set=new TreeSet<Integer>();	
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			set.add(a[i]);
		}
		System.out.println(set);
		
		Integer [] arg=set.toArray(new Integer[set.size()]);
		for(int i=0;i<set.size();i++)
		{
		System.out.print(arg[i]);
		}
	}

}
