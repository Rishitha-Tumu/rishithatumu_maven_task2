package com.vogella.maven.quickstart1;

public class Chocolates2 extends Chocolates1
{
	int i,min=max;
	public void find(int chocolates[],int c)
	{
		for(i=0;i<c;i++)
		{
			if(min>=chocolates[i])
			{
				min=chocolates[i];
			}
		}
	}
}
