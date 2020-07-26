package com.vogella.maven.quickstart1;

public class Sweets 
{
	public void Totalweight(int sweets[],int c)
	{
		int weight=0;
		for(int i=0;i<c;i++)
		{
			weight=weight+sweets[i];
		}
		System.out.println("The total weight of the sweets is: "+weight);
	}
	public void Printweights(int sweets[],int c)
	{
		for(int i=0;i<c;i++)
		{
			System.out.println("The weight of the sweet "+(i+1)+" is: "+sweets[i]);
		}
	}
}
