package com.basicprogramming;

public class arraypract {

	public static void main(String[] args)
	{
		int[][] a= {{2,3,4},{5,6,7}};
		for (int i=0; i<a.length;i++)
		{
			System.out.println("length of a "+a.length);
			System.out.println("      ");
		
			for (int j=0;j< a[i].length;j++)
			    {
				System.out.println("value of j "+j);
				 System.out.print("length of a[i] :"+a[i].length);
				 System.out.println("           ");
				  System.out.println(a[i][j]);
	             }	//for j
		}//for i
		}//static main

        }//class
