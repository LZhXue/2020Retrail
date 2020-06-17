import java.util.Scanner;

public class A_1125 {
	/*
	 * 题目描述 
	 * 编写程序，输入一个正整数n（1<=n<=10）和n阶方阵a中的元素，如果a是上三角矩阵，输出“YES”，否则，输出“NO”。
	 * 上三角矩阵即主对角线以下（不包括主对角线）的元素都为0的矩阵，主对角线为从矩阵的左上角至右下角的连线。
	 * 要求定义函数IsUpperTriMatrix()判断矩阵a是否是上三角矩阵，如果是返回1，否则返回0。函数原型如下：
	 * int IsUpperTriMatrix(int a[][N], int n); 
	 * 输入
	 * 输入一个正整数n（1<=n<=10）和n阶方阵a中的元素，均为整数。 
	 * 
	 * 输出 
	 * 如果a是上三角矩阵，输出“YES”，否则，输出“NO”
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
