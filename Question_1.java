//JEAN MUJURU R183432H

import java.util.Scanner;

public class Question_1{
	public static double area;
	public static double perimeter;
	public static void main(String[] args){
	    double a = 9, b = 10, c = 5;

		Scanner sc = new Scanner(System.in);
		area = AreaOfATriangle(a, b, c);
		perimeter = a + b + c;
		System.out.format("\nThe Area of triangle = " + area + " \n");
	}
	public static double AreaOfATriangle(double a, double b, double c){
		double s;
		s = (a + b + c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
}