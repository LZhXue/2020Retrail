import java.util.Formatter;
import java.util.Scanner;

public class triangleArea_1014 {
	/*
	 * ��Ŀ���� 
	 * ���������ε������ߣ��������ε������
	 * 
	 * ���� 
	 * ���������ε������߳���ʵ����������֮���ÿո������
	 * 
	 * ��� 
	 * ��������ε�������������2λС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		double p = (x+y+z)/2;
		double area = Math.sqrt(p*(p-x)*(p-y)*(p-z));
		Formatter fa = new Formatter().format("%.2f",area);
		System.out.println(fa);
		
	}

}
