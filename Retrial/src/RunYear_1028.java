import java.util.Scanner;

public class RunYear_1028 {
	/*
	 * ��Ŀ���� 
	 * ����һ����ݣ��ж��Ƿ������ꡣ 
	 * 
	 * ���� 
	 * ����Ϊһ����������ʾһ����ݡ�
	 * 
	 * ��� 
	 * ��������꣬���"Yes"���������"No"���������ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	
		int year = scan.nextInt();
		/*
		 * ������жϷ����ǣ�
		 *  1.���Ա�4����,�����ܱ�100����   ����
		 *  2.���Ա�400����
		 */
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
