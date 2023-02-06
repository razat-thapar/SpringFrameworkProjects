package com.razataggarwal.one_dependencyinjection.model;

public class Addition {
	
	private int a ; 
	private int b ; 
	
	public Addition(int a , int b) {
		this.a=a; 
		this.b=b; 
		System.out.println("Constructor : int,int");
	}
	
	public Addition(double a , double b) {
		this.a=(int)a; 
		this.b=(int)b; 
		System.out.println("Constructor : double,double");
	}
	
	public Addition(String a , String b) {
		this.a=Integer.parseInt(a); 
		this.b=Integer.parseInt(b); 
		System.out.println("Constructor : String,String");
	}
	
	public void doSum() {
		System.out.println("Sum = "+ (this.a + this.b) );
	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
	

}
