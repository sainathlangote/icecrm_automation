package com.icehrm_automation;

import org.testng.annotations.Test;

public class Mathematics {
  @test
  
  int a= 100; int b= 20;
  public void addition() {
	  System.out.println("inside addition method");
	  System.out.println("addition: "+ (a+b));
  }
  void substraction() {
	  System.out.println("inside substraction  method");
	  System.out.println("addition: "+ a-b);
  }
  void multiplication() {
	  System.out.println("inside Multiplication  method");
	  System.out.println("addition: "+ a*b);
  }
  void division() {
	  System.out.println("inside Division method");
	  System.out.println("addition: "+ a/b);
  }
}
