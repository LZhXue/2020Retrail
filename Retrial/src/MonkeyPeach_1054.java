import java.util.Scanner;

public class MonkeyPeach_1054 {
	/*
	��յ�һ��ժ���������ɣ������Ե�һ�룬������񫣬�ֶ��һ�����ڶ����ֽ�ʣ�µ����ӳԵ�һ���һ����
	�Ժ�ÿ��Ե�ǰһ��ʣ�µ�һ���һ��������n��׼���Ե�ʱ��ֻʣ��һ�����ӡ��������㣬��������һ�£�
	����һ�쿪ʼ�Ե�ʱ������һ���ж��ٸ��أ�
	
	����
	����һ����n��1<=n<=30����
	
	���
	�����һ������Ӹ�����
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int xx[] = new int[30];
		xx[0] = 1;
		for(int i=1;i<30;i++) {
			xx[i] = xx[i-1]*2+2;
		}
		System.out.println(xx[n-1]);
	}

}
