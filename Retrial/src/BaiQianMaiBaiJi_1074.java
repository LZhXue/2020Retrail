import java.util.Scanner;

public class BaiQianMaiBaiJi_1074 {
	/*
	 * ��Ǯ��ټ����⣺��������Ǯһֻ��ĸ������Ǯһֻ��С����ֻһ��Ǯ����100��Ǯ��100ֻ����������ĸ����С���������ֻ��
	 * ������Ҫ���������ǣ�����һ��������n����n��Ǯ��nֻ�����ʹ�����ĸ����С���������ֻ�� 
	 * 
	 * ���� 
	 * ����һ��������n(n<=100)�� 
	 * 
	 * ���
	 * ����н⣬�����ռһ�У�����������ĸ����С���ĸ���������������ʾ��ÿ������ռ4�С��Ҷ���
	 * ����ĸ��С�����������ڵ���0����������Ŀ��С���������
	 * ������Ŀ��ͬ��ĸ����Ŀ��С����������Դ����ơ�
	 * ����޽⣬�����No Answer����
	 */	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				for(double k = 0;k<n;k++) {
					if((5*i+3*j+k/3)==n&&(i+j+k==n)) {
						System.out.printf("%4d%4d%4.0f\n",i,j,k);
						flag = 1;
					}
				}
			}
		}
		if(flag==0) {
			System.out.println("No Answer");
		}
	}

}
