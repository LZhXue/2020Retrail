import java.util.Scanner;

public class JiShuChengJi {
	/*
	 * ��Ŀ���� 
	 * ����n�������������������������ĳ˻� 
	 * 
	 * ����
	 * �������ݰ����������ʵ����ÿ������ʵ��ռһ�У�ÿ�еĵ�һ����Ϊn����ʾ��������һ����n����������n������������Լ���ÿ�����ݱض����ٴ���һ��������
	 * 
	 * ���
	 * ���ÿ�����е����������ĳ˻������ڲ���ʵ�������һ�С�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			int sum = 1;
			for(int i = 0;i<n;i++) {
				int a = scan.nextInt();
				if(a%2!=0) {
					sum*=a;
				}
				if(i==n-1) {
					System.out.println(sum);
				}
			}
		}
	}

}
