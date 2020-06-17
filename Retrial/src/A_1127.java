import java.util.Scanner;

public class A_1127 {
	/*
	 * 题目描述 
	 * 计算两个矩阵A和B的乘积。 
	 * 
	 * 输入 
	 * 第一行三个正整数m、p和n，0<=m,n,p<=10，表示矩阵A是m行p列，矩阵B是p行n列；
	 * 接下来的m行是矩阵A的内容，每行p个整数，用空格隔开； 最后的p行是矩阵B的内容，每行n个整数，用空格隔开。 
	 * 
	 * 输出
	 * 输出乘积矩阵：输出占m行，每行n个数据，以空格隔开。
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
		//相乘
		int c[][] = new int[m][n];
		for(int i=0; i<m; i++)
	        for(int j=0; j<n; j++)
	        {
	            c[i][j]=0;
	            for(int k=0; k<p; k++)
	                c[i][j]+=a[i][k]*b[k][j];
	        }
		//输出
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
