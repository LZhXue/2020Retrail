import java.util.Scanner;

public class SuShuBiao_1092 {

	/**
	 * ��������������m��n�����m��n֮�������������
	 * Ҫ�������һ��prime()������һ��main()������prime()�����ж�һ������n�Ƿ������������๦����main()������ʵ�֡� 
	 * int prime(int n) { //�ж�n�Ƿ�Ϊ������ ��nΪ����������������1�����򷵻�0 }
	 * ����
 	 * ��������������m��n��m<=n���Ҷ���int��Χ�ڡ�
 	 * ���
 	 * ���ռһ�С����m��n֮�������������ÿ��������һ���ո񡣲������ݱ�֤m��n֮��һ����������
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		for (int i = m; i <= n; i++) {
			if (prime(i) == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static int prime(int n) {
		/*
		 * if ( n==1) { return 0; } 
		 * for(int i = 2;i<n;i++) { 
		 * 		if(n%i==0) { return 0; }
		 *  }
		 * return 1; 
		 */// ʱ�䳬��
		int in = 1;
		for (int j = 2; j <= Math.sqrt(n); j++) {
			if (n % j == 0) {
				in = 0;
				break;
			}
		}
		if(n==1) {
			in = 0;
		}
		return in;
	}
}
