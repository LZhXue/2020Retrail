import java.math.BigInteger;
import java.util.Scanner;

public class A_1151 {
	/*
	 * 题目描述 
	 * 比利经常会碰到超大整数的加法运算，而普通的计算器上无法进行。因此他想你帮他写一个程序来计算结果。
	 * 
	 * 输入 
	 * 输入数据有多组。首先输入一个整数T，表示有T组输入。
	 * 每组输入两个大整数，并用空格隔开。每个整数最多1000位。没有负数输入。
	 * 
	 * 输出 
	 * 对于每组输入，输出两个整数的和，单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String str = scan.nextLine();
			String arr[] = str.split(" +");
			BigInteger big1 = new BigInteger(arr[0]);
			BigInteger big2 = new BigInteger(arr[1]);
			System.out.println(big1.add(big2));
		}
	}

}
