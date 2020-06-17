import java.util.Scanner;

public class A_1120 {

	/*
	 * 题目描述 
	 * 有一个长度为n的整数序列。请写一个程序，先把序列中的最小值与第一个数交换，再把最大值与最后一个数交换。输出转换好的序列。
	 * 分别编写两个函数MinIndex()和MaxIndex()来计算最小值下标和最大值下标。 
	 * int MinIndex(int a[], int n);//函数返回数组a中最小元素的下标 
	 * int MaxIndex(int a[], int n); //函数返回数组a中最大元素的下标
	 * 数组元素的输出调用函数PrintArr()。 
	 * 
	 * 输入 
	 * 输入包括两行。 第一行为正整数n（1≤n≤10）。 第二行为n个正整数组成的序列，保证没有重复元素。
	 * 
	 * 输出 
	 * 输出转换好的序列。数据之间用空格隔开。
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
		int minIndex = MinIndex(arr,n);
		int temp1 = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp1;
		int maxIndex = MaxIndex(arr,n);
		int temp2 = arr[n-1];
		arr[n-1] = arr[maxIndex];
		arr[maxIndex] = temp2;
		PrintArr(arr,n);
		
		
	}
	
	public static int MinIndex(int a[],int n) {
		int min = a[0];
		int minIndex =0;
		for(int i = 1;i<n;i++) {
			if(min>a[i]) {
				min = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static int MaxIndex(int a[],int n) {
		int max = a[0];
		int maxIndex =0;
		for(int i = 1;i<n;i++) {
			if(max<a[i]) {
				max = a[i];
				maxIndex = i;
			}
		}
		return maxIndex;
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
