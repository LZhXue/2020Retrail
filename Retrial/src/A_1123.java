import java.util.Arrays;
import java.util.Scanner;

public class A_1123 {

	/*
	 * ��Ŀ���� 
	 * ����У�ѻ�ÿ��ٰ����Σ�����У�Ѷ���У�ѱ�ţ�ÿ�ε����У�Ѷ���ǩ������д���Լ��ı�ź���������У�ѻ����5����ľۻ��Ͻ��䷢�����У�ѽ�����
	 * �ý���䷢�������������У�ѡ����������д�����ҳ��������ĵ��������ж��У�Ѳ��е�һ������ɻ񽱡� 
	 * 
	 * ����
	 * �������ɸ���������ʾǩ�����ϵ�У�ѱ�ţ����б�ž�Ϊ0~99����������һ��������Ϊ��������ı�־�� 
	 * 
	 * ���
	 * ������ִ������ı�š�����ѡ���ж�����򰴴�С�����˳�����ѡ�ֱ�ţ��ÿո������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stand[] = new int[100];
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int in = scan.nextInt();
			if(in<0) {break;}
			stand[in]++;
		}
		int max = stand[0];
		for(int i = 1;i<stand.length;i++) {
			if(max<stand[i]) {
				max = stand[i];
			}
		}
		for(int i = 0;i<stand.length;i++) {
			if(max==stand[i]) {
				System.out.print(i+" ");
			}
		}
	}

}
