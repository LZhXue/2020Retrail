import java.util.Arrays;
import java.util.Scanner;

public class A_1119 {
	/*
	 * ��Ŀ���� ��һά���鰴�մ�С�����˳�����򡣳����庯��sort()��ʵ������a������ ����ԭ�����£� void sort(int a[], int
	 * n); ����Ԫ�ص��������PrintArr()��
	 * 
	 * ���� ��һ������һ������n��1<=n<=10)����ʾ������n���������ڶ�������n��������
	 * 
	 * ��� ���ռһ�С�����n�����������մ�С�����˳�����������֮����һ���ո������
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
