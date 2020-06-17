import java.util.Scanner;

public class A_1152 {
	/*
	 * 题目描述 在有序序列中查找某一元素x。
	 * 
	 * 输入 首先输入一个正整数n(n<=100000)，表示该序列有n个整数，然后按从小到大的顺序输入n个整数； 接着是一个正整数m，表示有m次查找；
	 * 最后是m个整数，表示m个要查找的整数x。
	 * 
	 * 输出 对于每一次查找，有一行输出。若序列中存在要查找的元素x，则输出元素x在序列中的序号（序号从0开始）；
	 * 若序列中不存在要查找的元素x，则输出"Not found!"。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		for (int i = 0; i < m; i++) {
			int toSearch = scan.nextInt();
			if(binarySearch(arr, toSearch)>=0) {
				System.out.println(binarySearch(arr, toSearch));
			}else {
				System.out.println("Not found!");
			}
			
		}
	}

	public static int binarySearch(int arr[], int m) {
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) / 2;
		while (max >= min) {
			if (m > arr[mid]) {
				min = mid + 1;
			} else if (m < arr[mid]) {
				max = mid - 1;
			} else {
				return mid;
			}
			mid = (max + min) / 2;
		}
		return -1;

	}

}
