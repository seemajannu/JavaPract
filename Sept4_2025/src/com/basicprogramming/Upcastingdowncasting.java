package com.basicprogramming;

	class Animal {
	    static void eat() {
	        System.out.println("Animal eats");
	    }
	     void sleep()
	     {
	    	 System.out.println("Animal sleeps");
	     }
	    
	}
	class Dog extends Animal {
	     void bark() {
	        System.out.println("Dog barks");
	    }
	     @Override
	     static  void eat()
	    {
	    	System.out.println("I eat bones");
	    }	    
	}
	public class Upcastingdowncasting {
		
	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        Animal an=new Animal();//an object can access eat and sleep
	        System.out.println("Animal has eat and sleep methods");
	        System.out.println("Dog has  overridden eat  and bark method");
	        System.out.println("     ");
	        System.out.println("my dog object solely");
	        myDog.bark();
	        myDog.eat();
	        myDog.sleep();
	        System.out.println("     ");
	        System.out.println("Upcasting of Dog object");
	        System.out.println("     ");
	        Animal animalRef =new Dog();  // Upcasting automatically
	        System.out.println("animalRef.eat();");
	        System.out.println("-----------------------");
	        animalRef.eat();// this shows eat of animal type but when ran it chooses dog function eat
	        System.out.println("     ");
	        System.out.println("animalRef.sleep();");
	        System.out.println("-----------------------");
	        animalRef.sleep();
	        System.out.println("     ");
	        System.out.println("animalRef.bark();-not accessible");
	       // animalRef.bark();
	        System.out.println("     ");
	        System.out.println("Downcasting of dog object");
	        Dog dg=(Dog) animalRef;
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

	       }
	}