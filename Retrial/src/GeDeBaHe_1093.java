import java.util.Scanner;

public class GeDeBaHe_1093 {

	/*
	 * ���� 
	 * һ��ż��M (M��6��1000000֮���һ��ż��). 
	 * 
	 * ���
	 * ����͵��ڸ�ż��������������a��b����a������˳�������(a,b)��(b,a)����Ϊͬһ�������ԡ�
	 */
	public static void main(String[] args) {
		// long�����ֵ9223372036854775807
		//int���ֵ2147483647
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		for(int i = 1;i<=m/2;i++) {
			if(prime(i)==1&&prime(m-i)==1) {
				System.out.println(i+" "+(m-i));
			}
		}
		
	}
	public static int prime(int x) {
		
		if(x==1) {
			return 0;
		}
		for(int i = 2;i<=Math.sqrt(x);i++) {
			if(x%i==0) {
				return 0;
			}
		}
		return 1;
	}
}
