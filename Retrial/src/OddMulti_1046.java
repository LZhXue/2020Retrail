import java.util.Scanner;

public class OddMulti_1046 {

	/*
	 * ����n�������������������������ĳ˻��� 
	 * 
	 * ���� 
	 * ��һ����Ϊn����ʾ��������һ����n����������n������������Լ���ÿ�����ݱض����ٴ���һ�������� 
	 * 
	 * ���
	 * ���n�����е����������ĳ˻���ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int mul = 1;
		for(int i = 0;i<n;i++) {
			int x = scan.nextInt();
			if(x%2!=0) {
				mul = mul*x;
			}
		}
		System.out.println(mul);
	}

}
