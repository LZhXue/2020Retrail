import java.util.Scanner;

public class FindMax_1043 {

	/*
	 * ����һ������n��n�������������n�����������ֵ��
	 * 
	 * ���� 
	 * ���������У���һ����һ��������n���ڶ�����n��������
	 * 
	 * ��� 
	 * �������һ����������n�����е����ֵ������ռһ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n-1] ;
		int max = scan.nextInt();
		for(int i = 0;i<n-1;i++) {
			arr[i] = scan.nextInt(); 
			if(max<arr[i]) {
				
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
