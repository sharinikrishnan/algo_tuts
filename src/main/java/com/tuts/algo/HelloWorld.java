package com.tuts.algo;

public class HelloWorld {
	private String greeting;
	private int a; 
	private int b;
	
	public HelloWorld(String greeting){ 
		this.greeting = greeting;
	
	}
	
	public HelloWorld(int a, int b){ 
		this.a=a;
		this.b=b;
	
	}
	
	public void greetings() { 
		System.out.println("Hello World! " + this.greeting );
	}
	
	public int addNumbers(int x,int y) {
		int z = x + y;
		return z;
	}
	public int multiplyNumbers() {
		int w = a * b;
		return w;
	}
	
	
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld("FLorida" );
		helloWorld.greetings();
		
		HelloWorld hw = new HelloWorld("California");
		int solution = hw.addNumbers(3, 2);
		System.out.println("The solution is " + solution);
		hw.greetings();
		
		int solution2= hw.multiplyNumbers();
		System.out.println("The solution2 is " + solution2);
		
		HelloWorld hw1= new HelloWorld(3, 2);
		int solution1 = hw1.multiplyNumbers();
		System.out.println("The solution1 is " + solution1);
		
		
	}

}
