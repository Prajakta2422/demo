package com.jbk;

public class PrimeNumTest {
	public static void main(String[] args) {
		int num=6;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println("not prime");
				break;
			}
			
			else
			{
				System.out.println("prime");
			}
		
		}
		
	}

}
