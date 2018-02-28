package Jisuan;

public class Qi {
	Jia jia = new Jia();
	Jian jian = new Jian();
	Cheng cheng = new Cheng();
	Chu chu = new Chu();
	Max max = new Max();
	Min min = new Min();
	
	public void min(){
		min.min();
	}
	
	public void max(){
		max.max();
	}
	
	public void jia(){
		jia.jiafa();
	}
	public void jian(){
		jian.jianfa();
	}
	public void cheng(){
		cheng.chengfa();
	}
	public void chu(){
		chu.chufa();
	}
	

	public static void main(String[] args) {
		Qi q = new Qi();
		q.cheng();
	}

}
