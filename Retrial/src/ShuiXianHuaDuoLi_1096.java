import java.util.Scanner;

public class ShuiXianHuaDuoLi_1096 {
	/**
	 * “水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=13+53+33。 
	 * 现在要求输出所有在m和n范围内的水仙花数。
	 * 要求程序定义一个 int narcissus(int n) { //判断n是否为水仙花数， 若是函数返回1，否则返回0 }
	 * 输入
	 * 输入数据有多组，每组占一行，包括两个整数m和n（100<=m<=n<=999）。
	 * 输出
	 * 对于每个测试实例，要求输出所有在给定范围内的水仙花数，就是说，
	 * 输出的水仙花数必须大于等于m,并且小于等于n，如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开;
	 * 如果给定的范围内不存在水仙花数，则输出no;每个测试实例的输出占一行。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int flag = 0;
			for(int i = m;i<=n;i++) {
				if(narcissus(i)==1) {
					flag = 1;
					System.out.print(i+" ");
				}
				if(i==n&&flag==1) {
					System.out.println();
				}
			}
			if(flag==0) {
				System.out.println("no");
			}
		}
	}
	
	public static int narcissus(int n) {
		int ge = n%10;
		int shi = n%100/10;
		int bai = n/100;
		if(ge*ge*ge+shi*shi*shi+bai*bai*bai==n) {
			return 1;
		}
		return 0;
	}

}
