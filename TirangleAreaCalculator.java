package com.codegnan.fundmentals;

import java.util.Scanner;

public class TirangleAreaCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		double base = scanner.nextDouble();
		System.out.println("Enter Height of the triangle : ");
		double height = scanner.nextDouble();
		double area=0.5*base*height;
		System.out.println("Area of Triangle : "+area);
		scanner.close();
	}
}
