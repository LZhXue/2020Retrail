import java.util.Scanner;

public class A_1238 {
	/*
	 * ��Ŀ���� 
	 * ������緹��ʱ��ZY�ļ�����С�Ĵ�������˳�����-_-# �������������m�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£�
	 * �����ڵ�n�����ʱ�������������ף������輦�������ơ���PS����Ժ�ļ����������Ǻã���
	 * 
	 * ���� 
	 * ���������ж��飬ÿ��ռһ�У��ֱ�Ϊһ��m,��n��m��n�Ķ������ϡ�
	 * 
	 * ��� �����n�����ʱ�������������ף�n<20,m<100�����������λС��
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			double m = scan.nextDouble();
			int n = scan.nextInt();
			double sum = m;
			double h = m/2;
			for(int i  = 0;i<n-1;i++) {
				sum+=h*2;
				h = h/2;
				
			}
			System.out.printf("%.2f\n",sum);
		}
	}

}
