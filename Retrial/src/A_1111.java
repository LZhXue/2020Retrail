import java.util.Scanner;

public class A_1111 {

	/*
	 * 题目描述 
	 * 输入n和n个整数，以与输入顺序相反的顺序输出这n个整数。要求不使用数组，而使用递归函数实现。 
	 * 递归函数实现过程如下： 
	 * void inverse(int n) { 
	 * if(n >1) { 
	 * (1) 读入一个整数，存入num; 
	 * (2) 将后面的n-1个数逆序输出:inverse(n-1); 
	 * (3) 输出num； } 
	 * if( n == 1) 直接输出num； } 
	 * 
	 * 输入
	 * 输入有两行，第一行是一个正整数n，第二行有n个整数，整数之间由空格隔开。 
	 * 输出 输出n个整数，顺序与输入顺序相反，每个整数后有一个空格。
	 */
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scan.nextInt();
		scan.nextLine();
		inverse(n);
	}
	public static void inverse(int n) {
		int num;
		if(n==1) {
			num = scan.nextInt();
			System.out.print(num+" ");
		}
		if(n>1) {
			num = scan.nextInt();
			inverse(n-1);
			System.out.print(num+" ");
		}
	}
}
