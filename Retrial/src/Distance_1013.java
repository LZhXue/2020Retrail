import java.util.Formatter;
import java.util.Scanner;

public class Distance_1013 {

	/*
	 * ��Ŀ����
	 * ����A(x1, y1), B(x2, y2)�������꣬�������Ǽ�ľ��롣
	 * 
	 * ����
	 * ��������ĸ�ʵ��x1, y1, x2, y2���ֱ��ÿո����������������������0��x1,x2,y1,y2��100��
	 * 
	 * ��� 
	 * ���ռһ�У�����һ��ʵ��d����ʾA, B�����ľ��롣���������λС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double dis = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		Formatter fdis = new Formatter().format("%.2f",dis);
		System.out.println(fdis);
	}

}
