package Jisuan;

import java.util.Scanner;

public class Jia {
	public void jiafa(){
		Scanner s = new Scanner(System.in);
		System.out.println("ÊäÈëÊı×Ö");
		double n = s.nextDouble();
		double m = s.nextDouble();
		suan(n,m);
		s.close();
	}

	private static double suan(double n, double m) {
		System.out.println(n+m);
		return m+n;
	}


}
