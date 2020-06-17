import java.util.Scanner;

public class NAdd_1039 {

	/*
	 * 题目描述 
	 * 输入一个整数n和n个整数，输出这n个整数的和。 
	 * 
	 * 输入 
	 * 输入有两行：第一行是一个正整数n，第二行是n个整数。 
	 * 
	 * 输出
	 * 输出一个整数，即n个数的和。输出单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum = sum + scan.nextInt();
		}
		System.out.println(sum);
	}

}
