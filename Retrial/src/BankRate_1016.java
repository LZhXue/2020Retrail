import java.util.Formatter;
import java.util.Scanner;

public class BankRate_1016 {
	/*
	 * ��Ŀ���� 
	 * ������1���ڶ��ڴ��������Ϊ2.25%������ΪdepositԪ���Ա�̼��㲢���n���ı���֮�͡�
	 * 
	 * ���� 
	 * ����һ����������һ��ʵ�����ֱ�����������ʹ���
	 * 
	 * ��� 
	 * ���һ��˫����ʵ����С�������6λ��Ч���֡�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		double dep = scan.nextDouble();
		double rate = 0.0225;
		for(int i =0;i<year;i++) {
			dep = dep+dep*rate;
		}
		Formatter fd = new Formatter().format("%.6f",dep);
		System.out.println(fd);
	}

}
