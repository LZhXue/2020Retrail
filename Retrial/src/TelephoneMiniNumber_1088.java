import java.util.Scanner;

public class TelephoneMiniNumber_1088 {
	/*
	 * ��Ŀ���� 
	 * ��Ҷ�֪�����ֻ�����һ��11λ�������ִ���ͬʱ����Ϊѧ�����������������У԰�����������ɹ����㽫����ӵ��һ���̺š�
	 * �������еĶ̺Ŷ�����6+�ֻ��ŵĺ�5λ���������Ϊ13512345678���ֻ�����Ӧ�Ķ̺ž���645678�� 
	 * ���ڣ��������һ��11λ�����ֻ����룬�����ҳ���Ӧ�Ķ̺���
	 * 
	 * ���� 
	 * �������ݵĵ�һ����һ��N(N <= 200)����ʾ��N���������ݣ���������N��ÿһ��Ϊһ��11λ���ֻ����롣 
	 * 
	 * ���
	 * ���Ӧ����N�У�ÿ�а���һ����Ӧ�Ķ̺ţ����Ӧ�������˳��һ�¡�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String str = scan.nextLine();
			String re = str.substring(6);
			System.out.println("6"+re);
		}

	}

}
