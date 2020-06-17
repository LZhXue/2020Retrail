import java.util.Scanner;

public class A_1117 {
	/**
	 * 题目描述 
	 * 输入n个整数构成一个数组，在这个数组中查找x是否存在，如果存在，删除x，并输出删除元素后的数组。
	 * 如果不存在，输出“Not Found”。
	 * 定义一个查找函数find(),在数组a中查找x，若找不到函数返回-1，若找到返回x的下标，
	 * 函数原型如下： int find(int a[], int n, int x); 然后在main()中，先调用函数find(),若查找失败输出“Not
	 * Found"；若查找成功，则调用上一题中定义的函数del()删除该元素，再调用上一题中的PrintArr()输出删除元素后的数组内容。 
	 * 
	 * 输入
	 * 输入第一行是一个正整数n（1<=n<=10）； 第二行是n个整数，构成一个数组； 第三行是一个整数x，表示待查找元素。 
	 * 
	 * 输出
	 * 输出删除元素后的数组，每个元素占4列，右对齐。如果不存在，输出“Not Found”。如果数组中有多个x，只删除下标最小的那个。
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
		int find = find(arr,n,del);
		if(find ==-1) {
			System.out.println("Not Found");
		}else {
			del(arr,n,find);
			PrintArr(arr,n-1);
		}
		
	}
	public static void PrintArr(int a[], int n) {
		for(int i = 0;i<n;i++) {
			System.out.printf("%4d",a[i]);
		}
	}
	public static int find(int a[], int n, int x) {
		for(int i = 0;i<n;i++) {
			if(a[i]==x) return i;
		}		
		return -1;
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
}
