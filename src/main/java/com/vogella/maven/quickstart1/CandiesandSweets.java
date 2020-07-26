package com.vogella.maven.quickstart1;
import java.util.Scanner;
public class CandiesandSweets 
{
	//Yesu Prabhu and Mary Matha and Joseph
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of gifts:");
		int n=s.nextInt();
		int[] sweets=new int[n];
		int[] chocolates=new int[n];
		int c1=0;
		int c2=0;
		int w1=0;
		int w2=0;
		int totalweight=0;
		System.out.println("Menu to choose the type of the gift");
		System.out.println("1.Sweets");
		System.out.println("2.Chocolates");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the type of the gift and it's weight:");		
			int t=s.nextInt();
			int w=s.nextInt();
			if(t==1)
			{
				sweets[c1++]=w;
				w1=w1+w;
			}
			else if(t==2)
			{
				chocolates[c2++]=w;
				w2=w2+w;
			}
			totalweight=totalweight+w;
		}
		Sweets s1=new Sweets();
		Sweets s2=new Sweets();
		s1.Totalweight(sweets,c1);
		s2.Printweights(sweets,c1);
		Chocolates1 ch1=new Chocolates1();
		Chocolates2 ch2=new Chocolates2();
		ch1.find(chocolates, c2);
		ch2.find(chocolates, c2);
		ChocolatesEncapsulation ce=new ChocolatesEncapsulation();
		ce.setchocolatesweight(w2,c2);
		System.out.println("The average weight of the chocolates is: "+ce.getchocolatesaverageweight());
		Collections co=new Collections();
		co.collection(chocolates,c2);
	}
}
