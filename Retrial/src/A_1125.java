import java.util.Scanner;

public class A_1125 {
	/*
	 * ��Ŀ���� 
	 * ��д��������һ��������n��1<=n<=10����n�׷���a�е�Ԫ�أ����a�������Ǿ��������YES�������������NO����
	 * �����Ǿ������Խ������£����������Խ��ߣ���Ԫ�ض�Ϊ0�ľ������Խ���Ϊ�Ӿ�������Ͻ������½ǵ����ߡ�
	 * Ҫ���庯��IsUpperTriMatrix()�жϾ���a�Ƿ��������Ǿ�������Ƿ���1�����򷵻�0������ԭ�����£�
	 * int IsUpperTriMatrix(int a[][N], int n); 
	 * ����
	 * ����һ��������n��1<=n<=10����n�׷���a�е�Ԫ�أ���Ϊ������ 
	 * 
	 * ��� 
	 * ���a�������Ǿ��������YES�������������NO��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[][] = new int[n][n];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		if(IsUpperTriMatrix(a,n)==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
public static int IsUpperTriMatrix(int a[][], int n) {
	int flag = 1;
	for(int i = 0;i<n;i++) {
		for(int j = 0;j<i;j++) {
			if(a[i][j]!=0) {
				flag = 0;
			}
		}
	}
	return flag;	
	}

}
