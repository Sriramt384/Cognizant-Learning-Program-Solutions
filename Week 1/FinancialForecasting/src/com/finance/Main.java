package com.finance;
import java.util.*;
public class Main {
	 public static double calculateFutureValue(double initialValue, double rate, int years) {
	        if (years==0) {
	            return initialValue;
	        } 
	        else{
	            return calculateFutureValue(initialValue, rate, years - 1) * (1 + rate);
	        }
	    }
	    public static void main(String[] args) {
	    	Scanner hi=new Scanner(System.in);
	        double initialValue = hi.nextDouble(); 
	        double rate = hi.nextDouble();
	        int years = hi.nextInt();
	        double futureValue = calculateFutureValue(initialValue, rate, years);
	        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);
	        hi.close();
	    }
}
