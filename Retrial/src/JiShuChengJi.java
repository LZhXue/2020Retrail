import java.util.Scanner;

public class JiShuChengJi {
	/*
	 * 题目描述 
	 * 给你n个整数，求他们中所有奇数的乘积 
	 * 
	 * 输入
	 * 输入数据包含多个测试实例，每个测试实例占一行，每行的第一个数为n，表示本组数据一共有n个，接着是n个整数，你可以假设每组数据必定至少存在一个奇数。
	 * 
	 * 输出
	 * 输出每组数中的所有奇数的乘积，对于测试实例，输出一行。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			int sum = 1;
			for(int i = 0;i<n;i++) {
				int a = scan.nextInt();
				if(a%2!=0) {
					sum*=a;
				}
				if(i==n-1) {
					System.out.println(sum);
				}
			}
		}
	}

}
