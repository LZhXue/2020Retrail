import java.math.BigInteger;
import java.util.Scanner;

public class A_1151 {
	/*
	 * ��Ŀ���� 
	 * �����������������������ļӷ����㣬����ͨ�ļ��������޷����С�������������дһ����������������
	 * 
	 * ���� 
	 * ���������ж��顣��������һ������T����ʾ��T�����롣
	 * ÿ���������������������ÿո������ÿ���������1000λ��û�и������롣
	 * 
	 * ��� 
	 * ����ÿ�����룬������������ĺͣ�����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String str = scan.nextLine();
			String arr[] = str.split(" +");
			BigInteger big1 = new BigInteger(arr[0]);
			BigInteger big2 = new BigInteger(arr[1]);
			System.out.println(big1.add(big2));
		}
	}

}
