import java.util.Scanner;

public class A_1118 {
	/**
	 * ��Ŀ���� 
	 * һ���ǵݼ����������������n��Ԫ�أ�����һ������num����num��������е��ʵ�λ�ã�ʹ�����Ա��ַǵݼ�����
	 * Ҫ����һ������insert()��������num����������a���ʵ�λ���ϣ�
	 * ����ԭ�����£� int insert(int a[], int n, int num); ���⺯����Ȼ������ǰ������ĺ���PrintArr()�����������Ԫ�ء� 
	 * 
	 * ����
	 * ���������С���һ����һ��������n��n<=1000���ڶ�����n���������������Ǵ���������num�� 
	 * 
	 * ���
	 * ����ǵݼ������n+1������������֮���ÿո���������ռһ�С�
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
