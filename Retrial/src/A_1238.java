import java.util.Scanner;

public class A_1238 {
	/*
	 * 题目描述 
	 * 今天吃午饭的时候，ZY的鸡蛋不小心从碗里掉了出来，-_-# 假设这个鸡蛋从m米高度自由落下，每次落地后反跳回原高度的一半；再落下，
	 * 求它在第n次落地时，共经过多少米？（假设鸡蛋不会破。。PS：轻院的鸡蛋质量就是好！）
	 * 
	 * 输入 
	 * 输入数据有多组，每组占一行，分别为一个m,和n，m和n的定义如上。
	 * 
	 * 输出 输出第n次落地时，共经过多少米？n<20,m<100，结果保留两位小数
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			double m = scan.nextDouble();
			int n = scan.nextInt();
			double sum = m;
			double h = m/2;
			for(int i  = 0;i<n-1;i++) {
				sum+=h*2;
				h = h/2;
				
			}
			System.out.printf("%.2f\n",sum);
		}
	}

}
