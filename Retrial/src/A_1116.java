import java.util.Scanner;

public class A_1116 {

	/*
	 * 题目描述 
	 * 输入一个递增有序的整型数组A有n个元素，删除下标为i的元素，使其仍保持连续有序。注意，有效下标从0开始。
	 * 定义如下两个函数分别实现删除元素操作和数组输出操作。 
	 * void del(int a[], int n, int i); 删除数组a中下标为i的元素
	 * void PrintArr(int a[], int n); 输出数组a的前n个元素 
	 * 
	 * 输入
	 * 输入分三行，第一行是一个整数n(n<10)，第二行是n个整数，第三行是要删除元素的下标i，i>=0。 
	 * 
	 * 输出
	 * 输出删除下标为i的元素后的数组元素，数据之间用空格隔开。
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
		scan.nextLine();
		int del = scan.nextInt();
		del(arr,n,del);
		PrintArr(arr,n-1);
		}
	public static void del(int a[], int n, int i) {
		for(int j = 0;j<n;j++) {
			if(j==i) {
				for(int k = j;k<n-1;k++) {
					a[k] = a[k+1];
				}
				return;
			}
		}
	}
	public static void PrintArr(int a[], int n) {
		for(int i = 0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
