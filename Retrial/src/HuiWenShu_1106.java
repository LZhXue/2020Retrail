import java.util.Scanner;

public class HuiWenShu_1106 {

	/*
	 * ��Ŀ���� һ��������������������Ҷ�����֮Ϊ���������ʹ������������֮Ϊ����������һ���ģ����������ͽл�������
	 * ������������m��n��m<n)���������[m��n]֮��Ļ������� 
	 * 
	 * ����
	 * ��������������m��n�����뱣֤m<n�� 
	 * 
	 * ��� 
	 * ����С�����˳�����m��n֮��Ļ�������ÿ����������һ���ո�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		for(int i = m;i<=n;i++) {
			String str = String.valueOf(i);
			int len = str.length();
			double sum = 0;
			for(int j = 0;j<len;j++) {
				sum = sum+Math.pow(10,j)*Integer.valueOf(str.charAt(j)-48);
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
		}
	}

}
