package com.arraypractise;

public class ArrayNumberPush {

	public static void main(String[] args) {
		 int[] a= {8,1,2,5,1};
		 int temp; 
		 int size=a.length;
		 System.out.println(size);
		 
		System.out.println("Array number before push");
		//System.out.println(a);
		
		//printing array
		    for(int m:a)
			System.out.println(m);
		    
		//logic to swap    
		 for(int i=0;i<(size-1);i++)
		 {
	       if(a[i]==1)
	       {
	    	
	    	 temp=a[i];
	    	 a[i]=a[i+1];
	    	 a[i+1]=temp;
	       }
	     }
		 System.out.println("Array after change");
		 for(int m:a)
			 System.out.println(m);

	}
}
