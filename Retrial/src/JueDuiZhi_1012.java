import java.util.Formatter;
import java.util.Scanner;

public class JueDuiZhi_1012 {
	/*
	 * ��Ŀ���� 
	 * ��ʵ���ľ���ֵ��
	 * 
	 * ���� 
	 * ����һ��ʵ����
	 * 
	 * ��� 
	 * ������ľ���ֵ�����������λС��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double m = scan.nextDouble();
		if(m>=0) {
			m = m;
		}else {
			m = m*(-1);
		}
		Formatter fm = new Formatter().format("%.2f",m);
		System.out.println(fm);
	}

}
