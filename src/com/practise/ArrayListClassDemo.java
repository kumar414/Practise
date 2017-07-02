package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class ArrayListClassDemo
//public class ArrayListClassDemo implements Comparator
{

	public static void main(String [] args)
	{
	
		
/*	public int compare(Object obj1,Object obj2)
	{
		String str1=obj1.toString();
		String str2=obj2.toString();
		if(str2.compareTo(str1)<g)
		{
			return -1;
		}
		else if(str2.compareTo(str1)>0)
		{
			return +1;
		}
	
	return -1;
	}*/
	
	
//-------------------------------------------------------------------------------
	//Integer sorting program
/*		int []a={9,20,99,88,88,9};
		List<Integer> lst=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			lst.add(a[i]);
		}
		Collections.sort(lst);
		System.out.println(lst);
		//Collections.sort(lst,Collections.reverseOrder());
		Collections.reverse(lst);
		System.out.println(lst);*/
	//------------------------------------------------------------------------------	
	//String sorting program
		/*String [] a={"ABC","DEF","CDE","ACB","ABC"};
		List<String> lst=new ArrayList<String>();
		for(int i=0;i<a.length;i++)
		{
			lst.add(a[i]);
		}
		Collections.sort(lst);
		System.out.println(lst);
		//Collections.sort(lst,Collections.reverseOrder());
		System.out.println(lst);
		TreeSet t=new TreeSet();
		t.addAll(lst);
		System.out.println("sorting  using treeset:"+t);*/
//------------------------------------------------------------------------------------------
			/* String s1="CFA DAF CDE ACB  ABC ";
             System.out.println(s1);
//breaking the sting into tokens or substrings----------------------------------------------
       		StringTokenizer tokens=new StringTokenizer(s1);
      		int tokencount= tokens.countTokens();
      		System.out.println(tokencount);
       		String str1="";
      		String output="";
      		for(int i=0;i<tokencount;i++)
      		{
    	       	 str1=tokens.nextToken();
    	 		 char []str1char=str1.toCharArray();
    	         lst=new ArrayList<Character>();
    	              for(int j=0;j<str1char.length;j++)
    	 				{
    	  						Arrays.sort(str1char);
    	 				}
    	 			str2=str2+new String(str1char)+" ";
      		}
        	System.out.print(str2.trim());
      } 	  */
//---------------------------------------------------------------------------
		/*   String s1="CFA DAF CDE ACB  ABC ";
	       System.out.println(s1);
	//breaking the sting into tokens or substrings
	      StringTokenizer tokens=new StringTokenizer(s1);
	      int tokencount= tokens.countTokens();
	      System.out.println(tokencount);
	       String str1="";
	       String str2="";
	       String output="";
	      List<Character> lst=null;
	      for(int i=0;i<tokencount;i++)
	      {
	    	  str1=tokens.nextToken();
	    	  char []str1char=str1.toCharArray();
	    	  lst=new ArrayList<Character>();
	    	  for(int j=0;j<str1char.length;j++)
	    	  		{
	    	  			lst.add(str1char[j]);
	    	  			Collections.sort(lst);
	    	  		}
	    	  Iterator ite=lst.iterator();
	    	  StringBuilder sb=new StringBuilder();
	    	  while(ite.hasNext())
	    	  {
	    		  output=sb.append(ite.next()).toString();
	    		 
	    	  }
	    	  output=output+" ";
	    	  System.out.print(output);
    	   
      }  	
	  	System.out.println();
	  	System.out.println(output);*/
//-----------------------------------------------------------------------------------------     
    /*//Sorting strings include duplicates 
      String [] str2=new String[tokencount];
      List<String> lst=new ArrayList<String>();
      for(int i=0;i<tokencount;i++)
      {
    	  str2[i]=tokens.nextToken();
    	  lst.add(str2[i]);
    	  Collections.sort(lst);
    	  
      }
      System.out.println(lst);*/
     //------------------------------------------------------------------------------------
     //Adding string to TreeSet that will remove duplicates
      /* String str1="";
         TreeSet t=new TreeSet();
      for(int i=0;i<tokencount;i++)
      {
    	  str1=tokens.nextToken();
    	  t.add(str1);
      }
      System.out.println(t);*/
     //------------------------------------------------------------------------------------
    }

}
