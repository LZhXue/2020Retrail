import java.util.Formatter;
import java.util.Scanner;

public class ShuLie2_1041 {

	/*
	 * ����һ������n���������1-1/3+1/5-����ǰn��ĺ͡� 
	 * 
	 * ����
	 * ����ֻ��һ������n�� 
	 * 
	 * ��� 
	 * �������2ΪС��,����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0.0;
		double d = 1;//��ĸ
		for(int i = 0;i<n;i++) {
			if(i%2==0) {
				sum = sum+1/d;
			}else {
				sum = sum-1/d;
			}
			
			d = d+2;
		}
		Formatter fs = new Formatter().format("%.2f",sum);
		System.out.println(fs);
	}

}
