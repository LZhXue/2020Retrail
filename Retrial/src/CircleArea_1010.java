import java.util.Formatter;
import java.util.Scanner;

public class CircleArea_1010 {
	/*
	 * ��Ŀ���� 
	 * ����Բ�İ뾶����Բ���ܳ�������� Ҫ����Բ����Ϊ���º곣�� #define PI 3.14159
	 * 
	 * ���� 
	 * ����뾶r��ֵ��Ϊһʵ����
	 *  
	 * ���
	 * ���һ�У������ܳ������������֮����һ���ո���������ݱ���С��������λ��
	 */
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double zhouchang = 2*PI*r;
		double area = PI*r*r;
		Formatter fz = new Formatter().format("%.2f",zhouchang);
		Formatter fa = new Formatter().format("%.2f",area);
//		System.out.print(fz);
//		System.out.print(" ");
//		System.out.print(fa);
		System.out.println(fz+" "+fa);

	}

}
