import java.util.Scanner;

public class ShuiXianHuaDuoLi_1096 {
	/**
	 * ��ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=13+53+33�� 
	 * ����Ҫ�����������m��n��Χ�ڵ�ˮ�ɻ�����
	 * Ҫ�������һ�� int narcissus(int n) { //�ж�n�Ƿ�Ϊˮ�ɻ����� ���Ǻ�������1�����򷵻�0 }
	 * ����
	 * ���������ж��飬ÿ��ռһ�У�������������m��n��100<=m<=n<=999����
	 * ���
	 * ����ÿ������ʵ����Ҫ����������ڸ�����Χ�ڵ�ˮ�ɻ���������˵��
	 * �����ˮ�ɻ���������ڵ���m,����С�ڵ���n������ж������Ҫ���С����������һ���������֮����һ���ո����;
	 * ��������ķ�Χ�ڲ�����ˮ�ɻ����������no;ÿ������ʵ�������ռһ�С�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int flag = 0;
			for(int i = m;i<=n;i++) {
				if(narcissus(i)==1) {
					flag = 1;
					System.out.print(i+" ");
				}
				if(i==n&&flag==1) {
					System.out.println();
				}
			}
			if(flag==0) {
				System.out.println("no");
			}
		}
	}
	
	public static int narcissus(int n) {
		int ge = n%10;
		int shi = n%100/10;
		int bai = n/100;
		if(ge*ge*ge+shi*shi*shi+bai*bai*bai==n) {
			return 1;
		}
		return 0;
	}

}
