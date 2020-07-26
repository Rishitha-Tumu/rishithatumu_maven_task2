package com.vogella.maven.quickstart1;

public class ChocolatesInterface implements Interface
{
	public void sortchocolates(int chocolates[],int c)
	{
		for(int i=c-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(chocolates[j]>chocolates[j+1])
				{
					int t=chocolates[j];
					chocolates[j]=chocolates[j+1];
					chocolates[j+1]=t;
				}
			}
		}
	}
}
