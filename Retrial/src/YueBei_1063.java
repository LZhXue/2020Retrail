import java.util.Scanner;

public class YueBei_1063 {

	/*
	 * ��Ŀ���� 
	 * ������������������������Լ������С�������� 
	 * 
	 * ���� 
	 * ��������������n��m��n,m<=1000000)�����뱣֤���ս����int��Χ�ڡ� 
	 * 
	 * ���
	 * ��������������ÿո��������ʾm��n�����Լ������С��������
	 */
	//��С������=������1*������2/���Լ����
	//���Լ����շת�����
	//int���ͷ����������long��ʾ
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		long a1 =a,b1 =b;
		long yue;
		if(a>=b) {
			while(a%b!=0) {
				long c = a%b;
				a = b;
				b = c;
			}
			yue = b;
		}else {
			while(b%a!=0) {
				long c = b%a;
				b = a;
				a = c;
			}
			yue = a;
		}
		long bei = a1*b1/yue;
		System.out.println(yue+" "+bei);
		
	}

}
