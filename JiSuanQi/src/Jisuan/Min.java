package Jisuan;

import java.util.Scanner;

public class Min {
	public void min(){
		Scanner s = new Scanner(System.in);
		System.out.println("��������a��");
		double a = s.nextDouble();
		System.out.println("��������b��");
		double b = s.nextDouble();
		double min = a<b?a:b;
		System.out.println(min);
		s.close();
		}
}
