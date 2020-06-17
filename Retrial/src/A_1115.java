import java.util.Scanner;

public class A_1115 {
	/*
	 * 题目描述 
	 * 数组a有n个元素，请输出n个元素的最小值及其下标。若最小值有多个，请输出下标最小的一个。注意，有效下标从0开始。 
	 * 
	 * 输入
	 * 输入分两行，第一行是一个正整数n（n<=1000)，第二行是n个整数。 
	 * 
	 * 输出 
	 * 输出占一行。输出数组的最小值及其下标，用空格隔开。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int j = 0;
		int small = scan.nextInt();
		for(int i = 1;i<n;i++) {
			int s = scan.nextInt();
			if(small>s) {
				small = s;
				j = i;
			}
		}
		System.out.println(small+" "+j);

	}

}
