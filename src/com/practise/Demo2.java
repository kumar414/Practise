	package com.practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Demo2 {
	
	public static void main(String arg[]) throws Exception
	{
		File src=new File("F:\\Coreseleniumfiles\\testing.txt");
		FileReader fr=new FileReader(src);
		BufferedReader br=new BufferedReader(fr);
		int lines=0, wordcount=0,charc=0;
		String line="";
		//String str="";
		//System.out.println(br.readLine());
		//StringTokenizer st=new StringTokenizer(",. ");	
		while((line=br.readLine())!=null)
		{
			lines++;
			//System.out.println(lines);
		
			StringTokenizer st=new StringTokenizer(line,",. ");	
			while(st.hasMoreTokens())
			{
				String str1=st.nextToken();
				//System.out.println(str1);  
				wordcount++;
				for(int i=0;i<str1.length();i++)
				{
					if(str1.charAt(i)!=' ' && str1.charAt(i)!='\n')
					{
						charc++;
					}
				}
				
			}
		}
		
	System.out.println(lines);
	System.out.println(wordcount);
	System.out.println(charc);
		
		//System.out.println(wordcount);
		
			// String[] word=line.split(" ");
			// wordcount=wordcount+word.length;
		/*	for(int i=0;i<line.length();i++)
			{
				if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
				{
					charc++;
				}
			}*/
			
		
	}

}
