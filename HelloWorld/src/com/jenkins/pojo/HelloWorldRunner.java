package com.jenkins.pojo;

public class HelloWorldRunner {

	public static void main(String[] args) {
	
		HelloWorld helloWorld = new HelloWorld();
		String msg = helloWorld.returnMessage("Jenkins");
		System.out.println(msg);
		
	}
}
