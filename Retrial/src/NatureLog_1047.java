import java.util.Formatter;
import java.util.Scanner;

public class NatureLog_1047 {

	/*
	 * ��������������m��n�����m��n֮��ÿ����������Ȼ������ 
	 * 
	 * ���� 
	 * ���������������m��n(m<=n)��֮����һ���ո������
	 * 
	 * ��� 
	 * ÿ�����һ�������������������ռ4�У�����ռ8�У��Ҷ��룬��������4λС����
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		for(int i = n;i<=m;i++) {
			double log = Math.log(i);
			System.out.printf("%4d%8.4f\n",i,log);//�Ҷ��룬��������4λС����
			
			
		}
	}

}
