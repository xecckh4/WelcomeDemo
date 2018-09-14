package com.bnym.welcomedemojavaproject;

public class WelcomeDemoJavaProject {
	
	private static String message = "Welcome Demo Java Project.";

	public static void main(String[] args) {
		System.out.println ("The name is-"+getName());

	}
	
	private static String getName(){
		return message;
	}

}
