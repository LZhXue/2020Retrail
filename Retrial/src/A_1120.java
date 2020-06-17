import java.util.Scanner;

public class A_1120 {

	/*
	 * ��Ŀ���� 
	 * ��һ������Ϊn���������С���дһ�������Ȱ������е���Сֵ���һ�����������ٰ����ֵ�����һ�������������ת���õ����С�
	 * �ֱ��д��������MinIndex()��MaxIndex()��������Сֵ�±�����ֵ�±ꡣ 
	 * int MinIndex(int a[], int n);//������������a����СԪ�ص��±� 
	 * int MaxIndex(int a[], int n); //������������a�����Ԫ�ص��±�
	 * ����Ԫ�ص�������ú���PrintArr()�� 
	 * 
	 * ���� 
	 * ����������С� ��һ��Ϊ������n��1��n��10���� �ڶ���Ϊn����������ɵ����У���֤û���ظ�Ԫ�ء�
	 * 
	 * ��� 
	 * ���ת���õ����С�����֮���ÿո������
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
