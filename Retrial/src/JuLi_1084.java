import java.util.Scanner;

public class JuLi_1084 {
	/*
	 * ��Ŀ���� 
	 * ���������꣨X1,Y1��,��X2,Y2��,���㲢��������ľ��롣 
	 * 
	 * ����
	 * ���������ж��飬ÿ��ռһ�У���4��ʵ����ɣ��ֱ��ʾx1,y1,x2,y2,����֮���ÿո������ 
	 * 
	 * ��� 
	 * ����ÿ���������ݣ����һ�У����������λС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double dis = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			System.out.printf("%.2f\n",dis);
		}
	}

}
