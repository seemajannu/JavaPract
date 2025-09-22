package com.assignments;

public class StatticNonAssignment1 {

		public int a=10;
		public static int b=20;
		public static int x=100;
		public int y=200;
		static StatticNonAssignment1 st2=new StatticNonAssignment1();
		
		public static void main(String[] args)
		{
//			StatticNonAssignment1 st2=new StatticNonAssignment1();
			test1();
		}
		public static void test1()
		{
			System.out.println("IN test 1");
//			a,x,y,b,test2,test3
			/*StatticNonAssignment1 st1=new StatticNonAssignment1();
			System.out.println(st1.a);
			System.out.println(x);
			System.out.println(st1.y);
			System.out.println(b);
        	st1.test2();*/
			st2.test2();
		    test3();
		}
		
		  public void test2()
		  {
			  System.out.println("IN test 2");
			  // test1,test3
		     // test1(); --------------------------------------this line causes error why?
		     test3(); 
		  }
		  
		  public static void test3() {
			  
		  System.out.println("IN test 3"); 
		  // a,x,y,b 
		  StatticNonAssignment1 st1=new StatticNonAssignment1();
		  System.out.println(st1.a); 
		  System.out.println(x);
		  System.out.println(st1.y); 
		  System.out.println(b);
		  }
		 
		  public void test4()
		  {
			  //this.test2();
			  StatticNonAssignment1 t2=new StatticNonAssignment1();
			  t2.test2();
		  }
	}
