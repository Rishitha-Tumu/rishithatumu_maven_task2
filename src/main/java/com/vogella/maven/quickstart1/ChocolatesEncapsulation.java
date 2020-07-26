package com.vogella.maven.quickstart1;

public class ChocolatesEncapsulation 
{
	private int w;
	private int c;
	public void setchocolatesweight(int weight,int ch)
	{
		w=weight;
		c=ch;
	}
	public int getchocolatesaverageweight()
	{
		return w/c;
	}
}
