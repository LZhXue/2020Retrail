import java.util.Formatter;
import java.util.Scanner;

public class Average_1009 {
	/*
	 * ��Ŀ���� 
	 * ��֪ĳλѧ������ѧ��Ӣ��ͼ�����γ̵ĳɼ�����������ſγ̵�ƽ���֡�
	 * 
	 * ���� 
	 * ������������������֮���ɿո������
	 * 
	 * ��� 
	 * ���ռһ�У�����һ��ʵ����Ϊ���ſε�ƽ���֣�������λС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x =scan.nextInt(),y = scan.nextInt(),z = scan.nextInt();
		Formatter f = new Formatter().format("%.2f",(x+y+z)/3);
		System.out.println(f);
		
	}

}
