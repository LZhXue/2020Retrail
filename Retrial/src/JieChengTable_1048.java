import java.util.Scanner;

public class JieChengTable_1048 {

	/*
	 * ����һ��������n(n<=20)�����1��n֮��׳˱� 
	 * 
	 * ���� 
	 * ����ֻ��һ��������n�� 
	 * 
	 * ���
	 * ���1��n֮��Ľ׳˱���ʽ�����������
	 * ÿ���������ݣ���һ������ռ4�У��ڶ�������ռ20�У�����롣
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long  n = scan.nextInt();
		long jiecheng = 1;
		for(long i = 1;i<n+1;i++) {
			jiecheng = jiecheng*i;
			System.out.printf("%-4d%-20d\n",i,jiecheng);
		}
	}

}
