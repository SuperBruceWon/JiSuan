package Jisuan;

import java.util.Scanner;

public class Jian {
	public void jianfa(){
		Scanner s = new Scanner(System.in);
		System.out.println("ÊäÈëÊı×Ö");
		double n = s.nextDouble();
		double m = s.nextDouble();
		suan(n,m);
		s.close();
	}

	private static double suan(double n, double m) {
		if(n>m){
			System.out.println(n-m);
			return n-m;
		}else if(n<m){
			System.out.println(m-n);
			return m-n;
		}else{
			System.out.println(0);
			return 0;
		}
	}
	
}
