package com.jenkins.pojo;

public class HelloWorldRunner extends HelloWorld {
	
	public HelloWorldRunner(int index) {
        index = index;
    }

    public static void main(String args[]) {
    	
    	String s1 = "dad";
    	String s2 = "";
    	for(int i=s1.length()-1;i>=0;i--)
    	{
    	s2= s2+s1.charAt(i);
    	}

    	System.out.println(s2);
    	
    			
    
    }

	
}
