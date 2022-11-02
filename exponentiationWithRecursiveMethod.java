package com.haktanozgur.exponentiationWithRecursiveMethod;

import java.util.Scanner;


public class exponentiationWithRecursiveMethod {

	public static double calculateExponent(double baseValue , double exponent) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Taban değerini giriniz : ");
	    baseValue = scanner.nextDouble();
		System.out.println("Üs değerini giriniz : ");
	    exponent = scanner.nextDouble();
	    System.out.println("Sonuç : " + Math.pow(baseValue, exponent));
	    
	    return calculateExponent(baseValue, exponent);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculateExponent(0, 0));

	}
}


