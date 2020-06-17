import java.util.Arrays;
import java.util.Scanner;

public class A_1119 {
	/*
	 * 题目描述 对一维数组按照从小到大的顺序排序。程序定义函数sort()来实现数组a的排序。 函数原型如下： void sort(int a[], int
	 * n); 数组元素的输出调用PrintArr()。
	 * 
	 * 输入 第一行输入一个整数n（1<=n<=10)，表示数组有n个整数；第二行输入n个整数。
	 * 
	 * 输出 输出占一行。对这n个整数数按照从小到大的顺序输出，数据之间用一个空格隔开。
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
		sort(arr,n);
		PrintArr(arr,n);
	}

	public static void sort(int a[], int n) {
		Arrays.parallelSort(a);
		return;
	}

	public static void PrintArr(int a[], int n) {
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + " ");
			}
		}
	}
}
