package com.basicprogramming;


class parent1 {
	
 void amthd()
 {
System.out.println("a method- parent1 class");
	}
 void bmthd()
 {
System.out.println("b method- parent1 class");
	}

}
class child1 extends parent1{
    @Override
	void amthd()
	 {
	System.out.println("c method- child class");
		}
	void dmthd()
	 {
	System.out.println("d method- child class");
		}
		

}
public class Upcastpract {

	public static void main(String[] args) {
		parent1 p=new child1();
		child1 c=new child1();
		c.amthd();
				
	}

}