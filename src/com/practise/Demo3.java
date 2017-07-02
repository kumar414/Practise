package com.practise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo3 {
	
	public static void main(String [] args) throws IOException
	{
	File src=new File("F:\\Coreseleniumfiles\\testing.txt");
	FileWriter fr=new FileWriter(src,true);
	BufferedWriter bw=new BufferedWriter(fr);
	PrintWriter out=new PrintWriter(bw);
	out.print("string"+"\n");
	System.out.println("sting writed");
	out.close();
	}

}
