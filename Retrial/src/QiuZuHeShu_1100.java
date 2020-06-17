import java.util.Scanner;

public class QiuZuHeShu_1100 {

	/**
	 * 组合数是m!/(k!(m-k)!)。要求编写函数fact()，实现求一个数的阶乘功能，在主函数中调用此函数。 
	 * int fact(int n) {//函数返回值为n的阶乘。 } 
	 * 
	 * 输入 
	 * 输入两个正整数m,k，k<=m<=12。 
	 * 
	 * 输出 
	 * 输出一个整数，即组合方案数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int k = scan.nextInt();
		int re = fact(m)/(fact(k)*fact(m-k));
		System.out.println(re);
	}
	public static int fact(int n) {
		if(n==0||n==1) {return 1;}
		else {return n*fact(n-1);}
	}
}
