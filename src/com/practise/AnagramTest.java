package com.practise;

import java.util.Arrays;

public class AnagramTest {
	
	static boolean isAnagram(int string1lenth,int string2length,char[]str1,char[]str2)
	{
		if(string1lenth!=string2length)
		{
		  return false;
		}
		else
		return Arrays.equals(str1, str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcd";
		String s2="dcba";
		//int s1length=s1.length();
		//int s2length=s2.length();
		char[] s1char=s1.trim().toCharArray();
		char []s2char=s2.trim().toCharArray();
		Arrays.sort(s1char);
		Arrays.sort(s2char);
		System.out.println(isAnagram(s1.length(),s2.length(),s1char,s2char));
		
		

	}

}
