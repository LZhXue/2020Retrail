import java.util.Scanner;

public class A_1116 {

	/*
	 * ��Ŀ���� 
	 * ����һ�������������������A��n��Ԫ�أ�ɾ���±�Ϊi��Ԫ�أ�ʹ���Ա�����������ע�⣬��Ч�±��0��ʼ��
	 * �����������������ֱ�ʵ��ɾ��Ԫ�ز������������������ 
	 * void del(int a[], int n, int i); ɾ������a���±�Ϊi��Ԫ��
	 * void PrintArr(int a[], int n); �������a��ǰn��Ԫ�� 
	 * 
	 * ����
	 * ��������У���һ����һ������n(n<10)���ڶ�����n����������������Ҫɾ��Ԫ�ص��±�i��i>=0�� 
	 * 
	 * ���
	 * ���ɾ���±�Ϊi��Ԫ�غ������Ԫ�أ�����֮���ÿո������
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
