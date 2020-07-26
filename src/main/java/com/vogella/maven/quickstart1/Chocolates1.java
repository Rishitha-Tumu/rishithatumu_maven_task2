package com.vogella.maven.quickstart1;

public class Chocolates1 
{
	int i,max=0;
	public void find(int chocolates[],int c)
	{
		for(i=0;i<c;i++)
		{
			if(max<chocolates[i])
			{
				max=chocolates[i];
			}
		}
	}
}
