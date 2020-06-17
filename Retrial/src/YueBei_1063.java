import java.util.Scanner;

public class YueBei_1063 {

	/*
	 * 题目描述 
	 * 输入两个正整数，输出其最大公约数和最小公倍数。 
	 * 
	 * 输入 
	 * 输入两个正整数n和m（n,m<=1000000)。输入保证最终结果在int范围内。 
	 * 
	 * 输出
	 * 输出两个整数，用空格隔开。表示m和n的最大公约数和最小公倍数。
	 */
	//最小公倍数=正整数1*正整数2/最大公约数。
	//最大公约数用辗转相除法
	//int类型发生溢出，用long表示
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		long a1 =a,b1 =b;
		long yue;
		if(a>=b) {
			while(a%b!=0) {
				long c = a%b;
				a = b;
				b = c;
			}
			yue = b;
		}else {
			while(b%a!=0) {
				long c = b%a;
				b = a;
				a = c;
			}
			yue = a;
		}
		long bei = a1*b1/yue;
		System.out.println(yue+" "+bei);
		
	}

}
