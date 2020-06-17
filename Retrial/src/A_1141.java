import java.util.Scanner;

public class A_1141 {
	/*
	 * 题目描述 
	 * 将十进制整数n转换成二进制，并保存在字符数组中，最后输出。要求定义并调用convert()函数,
	 * 将十进制整数n对应的二进制数存入字符数组str中。
	 * void convert(int n, char str[]);
	 * 
	 * 输入 
	 * 输入一个非负整数n，n<2^31。
	 * 
	 * 输出 
	 * 输出一个01字符串，即n对应的二进制数，不含前导0。输出占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char str[] = new char[32] ;
		convert(n,str);
		
	}
	public static void convert(int n, char str[]) {
		StringBuilder sb = new StringBuilder();
		while(n/2!=0) {
			sb.append(n%2);
			n = n/2;
		}
		sb.append(n%2);
		if(sb.length()==0) {
			sb.append(0);
		}
		sb.reverse();
		str = sb.toString().toCharArray();
		System.out.println(str);
	}
}
