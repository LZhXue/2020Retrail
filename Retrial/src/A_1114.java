import java.util.Scanner;

public class A_1114 {
	/**
	 * ��Ŀ���� ����n��1<=n<=10����n�����������������n��������
	 * 
	 * ���� ����n��1<=n<=10����Ȼ������n��������
	 * 
	 * ��� ���������n��������ÿ������ռ4�У��Ҷ��롣
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
		for(int i = n-1;i>=0;i--) {
			System.out.printf("%4d",arr[i]);//�Ҷ��벻�Ӹ�
		}
 	}

}
