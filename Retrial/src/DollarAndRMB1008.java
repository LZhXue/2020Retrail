import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class DollarAndRMB1008 {

	/*
	 * ��Ŀ����
	 * ������Ԫ������ҵĻ�����1��Ԫ�һ�6.5573Ԫ����ң�
	 * ��д����������Ԫ�Ľ�����ܶһ�������ҽ�
	 * 
	 * ����
	 * ������Ԫ�Ľ�
	 * 
	 * ���
	 * ����ܶһ�������ҵ���ֵ���������2λС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double m = scan.nextDouble()*6.5573;
//		DecimalFormat df = new DecimalFormat(".00");
//		System.out.println(df.format(m));//ע�⣬�������ص���һ���ַ�������
		Formatter fm = new Formatter().format("%.2f", m);//�������صĲ���һ��double���͵�
		System.out.print(fm);
	}

}
