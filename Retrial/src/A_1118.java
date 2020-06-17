import java.util.Scanner;

public class A_1118 {
	/**
	 * 题目描述 
	 * 一个非递减有序的整型数组有n个元素，给定一个整数num，将num插入该序列的适当位置，使序列仍保持非递减有序。
	 * 要求定义一个函数insert()，将整数num插入在数组a的适当位置上，
	 * 函数原型如下： int insert(int a[], int n, int num); 另外函数仍然调用以前定义过的函数PrintArr()输出数组所有元素。 
	 * 
	 * 输入
	 * 输入有三行。第一行是一个正整数n，n<=1000。第二行是n个整数，第三行是待插入整数num。 
	 * 
	 * 输出
	 * 输出非递减有序的n+1个整数，数据之间用空格隔开。输出占一行。
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
		int ins = scan.nextInt();
		
		int index[] = insert(arr,n,ins);
		PrintArr(index,n+1);
	}
	public static void PrintArr(int a[], int n) {
		for(int i = 0;i<n;i++) {
			if(i==n-1) {
				System.out.print(a[i]);
			}else {
				System.out.print(a[i]+" ");
			}
		}
	}
	public static int[] insert(int a[], int n, int num) {
		int res[] = new int[n+1];
		for(int i = 0;i<n;i++) {
			if(num<a[i]) {
				res[i] = num;
				for(int j = i;j<n;j++) {
					res[j+1] = a[j];
				}
				return res;
			}
			else {
				res[i] = a[i];
			}
		}
	return res;	
	}

}
