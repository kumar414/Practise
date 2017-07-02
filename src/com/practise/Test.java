package com.practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;

public class Test {

	public static void main(String[] args) throws IOException {
		
		File src=new File("F:\\Coreseleniumfiles\\testing.txt");
		FileReader fr=new FileReader(src);
		BufferedReader br=new BufferedReader(fr);
		int totalLines=0, wordcount=0,charc=0;
		String line="";
		int linesCountWithWords=0;
		//String str="";
		//System.out.println(br.readLine());
		StringTokenizer srt=new StringTokenizer(",. \r\n");
		while((line=br.readLine())!=null)
		{
			totalLines++;
			if(StringUtils.isEmpty(line))
			{
				linesCountWithWords=linesCountWithWords;
			}
			else
			{
				linesCountWithWords++;
			}
			
			
		}
		System.out.println(totalLines);
		System.out.println(linesCountWithWords);
	}

}
