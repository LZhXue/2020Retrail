import java.util.Scanner;

public class OrderSort_1061 {

	/*
	 * 题目描述 
	 * 输入一个不大于10的9次方的正整数，从高位开始逐位分割并输出各位数字。
	 * 
	 * 输入 
	 * 输入一个正整数n,n是int型数据 
	 * 
	 * 输出
	 * 依次输出各位上的数字，每一个数字后面有一个空格，输出占一行。例如，输入 12345 ，输出 1 2 3 4 5
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String  str = scan.nextLine();
		for(int i = 0;i<str.length();i++) {
			System.out.print(Integer.valueOf(str.charAt(i)-48)+" ");
		}
	}

}
