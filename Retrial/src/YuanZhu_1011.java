import java.util.Formatter;
import java.util.Scanner;

public class YuanZhu_1011 {

	/*
	 * ��Ŀ���� 
	 * ����Բ����ĵ���뾶r�͸�h������Բ����ı�������������Ļ�ϡ�
	 * Ҫ����Բ����Ϊ���º곣�� #define PI 3.14159
	 * 
	 * ���� 
	 * ��������ʵ����ΪԲ����ĵ���뾶r�͸�h��
	 * 
	 * ��� 
	 * ���һ��ʵ������Բ����ı����������2λС����
	 */
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double h = scan.nextDouble();
		double area = 2*PI*r*r+2*PI*r*h;
		Formatter fa = new Formatter().format("%.2f",area);
		System.out.println(fa);
	}

}
