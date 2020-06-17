import java.util.Arrays;
import java.util.Scanner;

public class A_1275 {
	/*
	 * 题目描述 
	 * 首先给你n个有序整数，然后给你m个数，你能快速确定这m个数在这n个数中出现过吗？
	 * 
	 * 输入 
	 * 有1组测试数据。第一行是一个整数n ，范围为0到1000000。第二行n个整数,每个整数的范围为0到10^9
	 * 第三行是一个整数m，范围为0到1000000，第四行m个整数，每个整数的范围为0到10^9 。
	 * 
	 * 输出 
	 * 对应输入的m个整数，输出m行相应的结果。第i个数如果在前n个整数中出现过输出其位置，否则输出no。按照m个整数的顺序输出相应的结果。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nn[] = new int[n];
		for(int i = 0;i<n;i++) {
			nn[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		for(int i = 0;i<m;i++) {
			int temp = scan.nextInt();
			int a = Arrays.binarySearch(nn, temp);
			if(a>=0) {
				System.out.println(a+1);
			}
			else {
				System.out.println("no");
			}
		}
	}

}
