import java.util.Scanner;

public class NiXuShuZi_1101 {

	/*
	 * 输入一个正整数n，计算n的逆序数m，输出m与n的和。
	 * inverse()函数接收一个整数值,返回这个数中数字逆序后的结果值。例如,给定数7631,函数返回1367 。 
	 * int inverse(int n) { //计算并返回n的逆序数字 } 
	 * 
	 * 输入
	 * 一个正整数n，输入保证计算结果在int范围内。 
	 * 
	 * 输出 
	 * 输出一个整数，n与n的逆序数的和。输出占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(n+inverse(n));
	}
	public static int inverse(int n) {
		String str = String.valueOf(n);
		double sum = 0;
		for(int i = 0;i<str.length();i++) {
			sum = sum+Math.pow(10, i)*(Integer.valueOf(str.charAt(i))-48);
		}
		int summ = (int)Math.floor(sum);
		return summ;
	}
}
