import java.util.Formatter;
import java.util.Scanner;

public class SummerPropt_1034 {

	/*
	 * ��Ŀ����
	 * �̳��ļ�����������500Ԫ���£������ۣ�
	 * ����500Ԫ���������ϣ�95�ۣ�
	 * ����1000Ԫ���������ϣ�9�ۣ�
	 * ����3000Ԫ���������ϣ�85�ۣ�
	 * ����5000Ԫ���������ϣ�8�ۡ�
	 * �������ѽ�ȷ���û�ʵ����Ҫ֧������Ŀ�� 
	 * 
	 * ���� 
	 * ����һ��ʵ������ʾ���ѽ� 
	 * 
	 * ���
	 * ���һ��ʵ������ʾ�û�ʵ����Ҫ֧������Ŀ��������λС����
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		if(x>=500&&x<1000) {
			x = x*0.95; 
		}else if(x>=1000&&x<3000) {
			x = x*0.9; 
		}else if(x>=3000&&x<5000) {
			x = x*0.85; 
		}else if(x>=5000) {
			x = x*0.8; 
		}
		Formatter fx = new Formatter().format("%.2f",x);
		System.out.println(fx);
		
	}

}
