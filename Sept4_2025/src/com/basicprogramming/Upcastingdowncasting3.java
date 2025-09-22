package com.basicprogramming;

	class Animal1 {
	    void eat() {
	        System.out.println("Animal eats");
	    }
	     void sleep()
	     {
	    	 System.out.println("Animal sleeps");
	     }
	    
	}
	class Dog1 extends Animal1 {
	    void bark() {
	        System.out.println("Dog barks");
	    }
	     void vaccinate()
	    {
	    	System.out.println("I got vaccinated");
	    }	    
	}
	public class Upcastingdowncasting3 {
		
	    public static void main(String[] args) {
	        Dog1 myDog = new Dog1();
	        Animal1 an=new Animal1();//an object can access eat and sleep
	        System.out.println("Animal has eat and sleep methods");
	        System.out.println("Dog has  vaccinate  and bark method");
	        System.out.println("     ");
	        System.out.println("my dog object solely");
	        myDog.bark();
	        myDog.eat();
	        myDog.sleep();
	        System.out.println("     ");
	        System.out.println("Upcasting of Dog object");
	        System.out.println("     ");
	        Animal1 animalRef =new Dog1();  // Upcasting automatically
	        System.out.println("animalRef.eat();");
	        System.out.println("-----------------------");
	        animalRef.eat();// this shows eat of animal type but when ran it chooses dog function eat
	        System.out.println("     ");
	        System.out.println("animalRef.sleep();");
	        System.out.println("-----------------------");
	        animalRef.sleep();
	        System.out.println("     ");
	        System.out.println("animalRef.bark();-not accessible");
	       //animalRef.bark();
	        System.out.println("     ");
	        System.out.println("animalRef.vaccinate();-not accessible");
	      // animalRef.vaccinate();
	        System.out.println("     ");
	        System.out.println("Downcasting of dog object");
	        Dog1 dg=(Dog1) animalRef;
	        System.out.println("     ");
	        System.out.println("dg.bark();");
	        System.out.println("-----------------------");
	        dg.bark();
	        System.out.println("     ");
	        System.out.println("dg.eat();");
	        System.out.println("-----------------------");
	        dg.eat();
	        System.out.println("     ");
	        System.out.println("dg.sleep();");
	        System.out.println("-----------------------");
	        dg.sleep();
	        System.out.println("     ");
	        System.out.println("dg.vaccinate();");
	        System.out.println("-----------------------");
	        dg.vaccinate();
	       }
	}