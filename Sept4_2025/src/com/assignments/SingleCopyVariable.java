package com.assignments;

class SingleCopyVariable {
	
		public static int a =10;
		public static int b =20;
		SingleCopyVariable obj = new SingleCopyVariable();
		
		public static void main(String[] args)
		  {

			//SingleCopyVariable obj = new SingleCopyVariable();
			System.out.println(a); //10
			System.out.println(b); //20
			
			a = 100;
			b = 200;
			
			//SingleCopyVariable obj1 = new SingleCopyVariable();
			System.out.println(a); 
			System.out.println(b); 
		
			
			/*
			 * SingleCopyVariable obj2 = new SingleCopyVariable();
			 * System.out.println(obj.a); System.out.println(obj.b);
			 */
			
		}

		


}
