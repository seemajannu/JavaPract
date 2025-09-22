package com.assignments;

public class globalobject {

	public static globalobject obj = new globalobject();

	public static void main(String[] args)
	   {
//		Ex3 obj = new Ex3();
//		obj.test1();

		//obj.test1();
	    test2();
		test3();

 	}

	public void test1() {
		System.out.println(1);
	}

	public static void test2() {
		// test1()
       //		Ex3 obj = new Ex3();
       //		obj.test1();
		obj.test1();

	}

	public static void test3() 
	{
		System.out.println("test3");
//		Ex3 obj = new Ex3();
//		obj.test1();
		obj.test1();
	}
	
}  
      