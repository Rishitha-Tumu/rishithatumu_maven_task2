package com.vogella.maven.quickstart1;

import java.util.ArrayList;

public class Collections 
{
	public void collection(int chocolates[],int c)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<c;i++)
		{
			list.add(chocolates[i]);
		}
		System.out.println("The chocolates weights in the collection class is: "+list);
	}
}
