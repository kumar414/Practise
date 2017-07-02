package com.practise;

import java.util.Arrays;

public class ConsecutiveTest {
	
static boolean consecutive(int arraylength,int []a)
{
  for (int i=0;i<arraylength-1;i++)
  {
	  if(a[i+1]-a[i]!=1)
	  {
		  return false;
	  }
	  
  }
  	return true;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int [] a={-1,-3,5,-2,1,0};
		int b= a.length;
        Arrays.sort(a);
        //ssSystem.out.println(a);
        //ConsecutiveTest obj=new ConsecutiveTest();
       if(consecutive(b, a))
       {
    	   System.out.println("given array is consecute");
       }
       else
       {
    	   System.out.println("given array is not consecutive");
       }
	}

}



