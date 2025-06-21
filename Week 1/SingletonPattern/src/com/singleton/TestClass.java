package com.singleton;

public class TestClass {
	public static void main(String[] args) {
		Logger logger1=Logger.getInstance();
		logger1.log("This Is The First Log Message");
		Logger logger2=Logger.getInstance();
		logger2.log("This Is The Second Log Message");
		if(logger1==logger2) {
			System.out.println("Both the Instances are the same");
		}
		else {
			System.out.println("Singleton Pattern Implementation Failed");
		}
	}
}
