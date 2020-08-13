package com.jenkins.pojo;

public class HelloWorldRunner {

	public static void main(String[] args) {
	
		HelloWorld helloWorld = null;
		String msg = helloWorld.returnMessage("Jenkins");
		System.out.println(msg);
		
	}
}
