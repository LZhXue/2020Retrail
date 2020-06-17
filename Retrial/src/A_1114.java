import java.util.Scanner;

public class A_1114 {
	/**
	 * 题目描述 输入n（1<=n<=10）和n个整数，逆序输出这n个整数。
	 * 
	 * 输入 输入n（1<=n<=10），然后输入n个整数。
	 * 
	 * 输出 逆序输出这n个整数，每个整数占4列，右对齐。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		for(int i = n-1;i>=0;i--) {
			System.out.printf("%4d",arr[i]);//右对齐不加杠
		}
 	}

}
