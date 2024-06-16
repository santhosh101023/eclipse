package com.example.DbUsingProfile.contro;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
class a{
 
 public void add(){
      System.out.println("add()");
 }
 
}

class B extends a{
	
  public void sub(){
      System.out.println("sub()");
 }
  public void add(){
	  super.add();
      System.out.println("add()for B");
 }
 
}
class c extends B{
  public void mulit(){
      System.out.println("multi()");
 }
 
}

class TEST {
 public static void main(String[] args) {
// c objc=new c();
// objc.add();
// objc.mulit();
// objc.sub();
//
//
 
 B objB=new B();
// objB.add();
	
 System.exit(0);
 

 }
}