package Jisuan;

import java.util.Scanner;

public class Chu {
	public void chufa(){
		Scanner s = new Scanner(System.in);
		System.out.println("ÊäÈëÊý×Ö");
		double n = s.nextDouble();
		double m = s.nextDouble();
		suan(n,m);
		s.close();
	}

	private void suan(double n, double m) {
		if(n>m){
			System.out.println(n/m);
		}else if(n<m){
			System.out.println(m/m);
		}else{
			System.out.println(0);
		}
	}
	public static void main(String[] args) {
		Chu c = new Chu();
		c.chufa();
	}

}
