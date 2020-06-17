import java.util.Scanner;

public class A_1218 {
	/*
	 * 题目描述 这是一个简单的问题，给你两个正整数a，b（0<=a,b<=2^31），然后把a和b反转然后相加；具体看样例；
	 * 
	 * 输入 每组首先输入一个整数t，表示有t组数据。 以后每组数据占一行，且为两个整数a和b（没有前导0）。
	 * 
	 * 输出 对于每组数据 ，输出数字反转相加后的结果。每组占一行。没有前导0！
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<t;i++) {
			String str[] = scan.nextLine().split(" +");
			String str1 = str[0];
			String str2 = str[1];
			System.out.println(reverseAndAdd(str1,str2));
		}
	}
	
	public static int reverseAndAdd(String str1,String str2) {
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str2);
		sb1.reverse();
		sb2.reverse();
		return Integer.valueOf(sb1.toString())+Integer.valueOf(sb2.toString());
	}
}
