import java.util.Scanner;

public class A_1152 {
	/*
	 * ��Ŀ���� �����������в���ĳһԪ��x��
	 * 
	 * ���� ��������һ��������n(n<=100000)����ʾ��������n��������Ȼ�󰴴�С�����˳������n�������� ������һ��������m����ʾ��m�β��ң�
	 * �����m����������ʾm��Ҫ���ҵ�����x��
	 * 
	 * ��� ����ÿһ�β��ң���һ��������������д���Ҫ���ҵ�Ԫ��x�������Ԫ��x�������е���ţ���Ŵ�0��ʼ����
	 * �������в�����Ҫ���ҵ�Ԫ��x�������"Not found!"��
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
