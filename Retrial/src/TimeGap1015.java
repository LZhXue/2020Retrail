import java.util.Scanner;

public class TimeGap1015 {
	/*
	 * ��Ŀ���� 
	 * ���������á�ʱ:��:�롱��ʾ��ʱ��㣬��������Ϊ��λ��ʱ������
	 * 
	 * ���� 
	 * ���������У�ÿ����һ���á�ʱ:��:�롱��ʾ��ʱ��㡣�������ݱ�֤�ڶ���ʱ������ڵ�һ��ʱ��㡣
	 * 
	 * ��� 
	 * ���һ����������ʾʱ������������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String t1 = scan.nextLine();
		String t2 = scan.nextLine();
		String tt1[] = t1.split(":");//�ַ����ָ�
		String tt2[] = t2.split(":");
		int a1 = Integer.valueOf(tt1[0]);
		int b1 = Integer.valueOf(tt1[1]);
		int c1 = Integer.valueOf(tt1[2]);
		int a2 = Integer.valueOf(tt2[0]);
		int b2 = Integer.valueOf(tt2[1]);
		int c2 = Integer.valueOf(tt2[2]);//ת��Ϊ����
//		double cc = Double.valueOf(tt1[0]);  // ת��ΪС��
		int timeGap = (a2*3600+b2*60+c2)-(a1*3600+b1*60+c1);//ͳһ��λ
		System.out.println(timeGap);
	}

}
