import java.util.Formatter;
import java.util.Scanner;

public class FailedRate_1044 {

	/*
	 * ��Ŀ���� 
	 * ����n��n��ѧ���ɼ�(ʵ����������������ʡ�
	 * 
	 * ���� 
	 * ����ĵ�һ����һ������n���ڶ�����n��ʵ�����ÿո������
	 * 
	 * ��� 
	 * ���һ��ʵ������ʾ�������ʣ��������2λС��������ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double num = 0;
		for(int i = 0;i<n;i++) {
			if(scan.nextDouble()<60) {
				num++;
			}
			
		}
		Formatter fr = new Formatter().format("%.2f",num/n);
		System.out.println(fr);

	}

}
