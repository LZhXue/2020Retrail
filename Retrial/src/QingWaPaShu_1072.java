import java.util.Scanner;

public class QingWaPaShu_1072 {

	/*
	 * ��Ŀ���� 
	 * ��һ�����Ϊhigh�׵�ˮ����������һֻ���ܣ���ÿ������ܹ��ؾ���������up�ף�ҹ����˳�������»�down�ף�
	 * �����ܴ�ĳ���糿��ʼ����������������ָ����high��up��downֵ����Ϊ��Ȼ�������������ܶ������ܹ��������ڣ� 
	 * 
	 * ���� 
	 * ����3����������high��up��down�� 
	 * 
	 * ���
	 * ���һ����������ʾ�������������ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		int up = scan.nextInt();
		int down = scan.nextInt();
		int i = 0;
		int day = 0;
		while(high!=0) {
			if(i%2==0) {
				high = high-up;
				day++;
			}else {
				high = high+down;
			}
			i++;
		}
		System.out.println(day);
	}

}
