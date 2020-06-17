import java.util.Formatter;
import java.util.Scanner;

public class ShuLie3_1042 {
	/*
	 * ��1-2/3+3/5-4/7+5/9-6/11+...��ǰn��ͣ��������3λС���� 
	 * 
	 * ���� 
	 * ����������n(n>0)�� 
	 * 
	 * ���
	 * ���һ��ʵ��������3λС��������ռһ�С�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0;
		double fz = 1;
		double fm = 1;
		for(int i = 0;i<n;i++) {
			if(i%2==0) {
				sum = sum+fz/fm;
			}else {
				sum = sum-fz/fm;
			}
			fz+=1;
			fm+=2;
		}
		Formatter fs = new Formatter().format("%.3f",sum);
		System.out.println(fs);
	}

}
