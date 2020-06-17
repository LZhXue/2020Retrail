import java.util.Scanner;

public class NNumberAdd_1081 {

	/*
	 * 题目描述 
	 * 求n个整数的和。 
	 * 
	 * 输入 
	 * 输入第一行是一个整数T，表示有T组测试实例； 每组输入包括两行： 第一行一个数n表示接下来会有n个整数；
	 * 第二行空格隔开的n个数。 
	 * 
	 * 输出 
	 * 对于每组输入，在一行输出n个数的和（保证和不会超出int类型的范围）！
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0;i<t;i++) {
			int n = scan.nextInt();
			int sum = 0;
			for(int j = 0;j<n;j++) {
				sum = sum+scan.nextInt();
				if(j==n-1) {
					System.out.println(sum);
				}
			}
		}
	}

}
