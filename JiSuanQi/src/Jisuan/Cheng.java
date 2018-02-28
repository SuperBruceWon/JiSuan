package Jisuan;

import java.util.Scanner;

public class Cheng {
	public void chengfa(){
		Scanner s = new Scanner(System.in);
		System.out.println("ÊäÈëÊı×Ö");
		double n = s.nextDouble();
		double m = s.nextDouble();
		suan(n,m);
		s.close();
	}

	private void suan(double n, double m) {
		System.out.println(n*m);
	}


}
