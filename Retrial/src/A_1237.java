import java.util.Scanner;

public class A_1237 {
	/*
	 * ��Ŀ���� 
	 * ��5������һ�𣬵��ʵ�5���˶�����,��˵�ȵ�4���˴�2�꣬�ʵ�4���˶�����,��˵�ȵ�3���˴�2�꣬������ȥ���ʵ�һ���˶����꣬��˵��10�꣬
	 * ������5���˶����ꣿ��������Ĳ���5�˶���n�ˣ�д����n���˵����䡣
	 * 
	 * 
	 * ���� 
	 * N��ʵ��,ÿ��ʵ����������������n��m����һ����ʾn���ˣ��ڶ�����ʾ���һ�����ʵ��˵����䡣
	 * 
	 * ��� �����n���˵����䣬ռһ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1;i<=t;i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			System.out.println(m+(n-1)*2);
		}
	}

}
