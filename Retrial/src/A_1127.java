import java.util.Scanner;

public class A_1127 {
	/*
	 * ��Ŀ���� 
	 * ������������A��B�ĳ˻��� 
	 * 
	 * ���� 
	 * ��һ������������m��p��n��0<=m,n,p<=10����ʾ����A��m��p�У�����B��p��n�У�
	 * ��������m���Ǿ���A�����ݣ�ÿ��p���������ÿո������ ����p���Ǿ���B�����ݣ�ÿ��n���������ÿո������ 
	 * 
	 * ���
	 * ����˻��������ռm�У�ÿ��n�����ݣ��Կո������
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int p = scan.nextInt();
		int n = scan.nextInt();
		int a[][] = new int[m][p];
		int b[][] = new int[p][n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<p;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for(int i = 0;i<p;i++) {
			for(int j = 0;j<n;j++) {
				b[i][j] = scan.nextInt();
			}
		}
		//���
		int c[][] = new int[m][n];
		for(int i=0; i<m; i++)
	        for(int j=0; j<n; j++)
	        {
	            c[i][j]=0;
	            for(int k=0; k<p; k++)
	                c[i][j]+=a[i][k]*b[k][j];
	        }
		//���
	    for(int i=0; i<m; i++)
	    {
	        System.out.print(c[i][0]+" ");
	        for(int j=1; j<n; j++)
	        {
	            System.out.print(c[i][j]+" ");
	        }
	        System.out.println();
	    }

	}

}
