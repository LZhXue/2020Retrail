import java.math.BigInteger;
import java.util.Scanner;

public class DaShuMi_1090 {

	/**
	 * ��Ŀ���� 
	 * ��A^B�������λ����ʾ��������1<=A,B<=1000�� 
	 * 
	 * ����
	 * ��һ������һ������n����ʾ��n������ʵ����������n�У�ÿ��һ��ʵ������������������A,B 
	 * 
	 * ��� 
	 * ���ÿ������ʵ�������A^B�������λ��û��ǰ��0�� ������ռһ�С�
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			String stra = String.valueOf(a);
			String strb = String.valueOf(b);
			BigInteger bia = new BigInteger(stra);
			BigInteger bib = new BigInteger(strb);
			BigInteger bigMul = new BigInteger("1");
			for(int j = 0;j<b;j++) {
				bigMul = bigMul.multiply(bia);
			}
			String re = bigMul.toString();
			int len = re.length();
			if(len>3) {
				re = re.substring(len-3);
			}
			int reInt = Integer.valueOf(re);
			System.out.println(re);
			scan.nextLine();
		}

	}

}
