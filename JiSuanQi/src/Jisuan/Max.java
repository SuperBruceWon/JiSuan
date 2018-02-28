package Jisuan;

import java.util.Scanner;

public class Max {
	public void max(){
		Scanner s = new Scanner(System.in);
		System.out.println("输入数字a：");
		double a = s.nextDouble();
		System.out.println("输入数字b：");
		double b = s.nextDouble();
		double max = a>b?a:b;
		System.out.println(max);
		s.close();
		}
	public static void main(String[] args) {
		Max m = new Max();
		m.max();
	}

}
