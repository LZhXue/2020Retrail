import java.util.Scanner;

public class A_1126 {
	/*
	 * 题目描述 一个布尔方阵具有奇偶均势特性，当且仅当 每行、每列总和为偶数，即包含偶数个1。
	 * 编写程序，读入一个n阶方阵并检查它是否具有奇偶均势特性。如果没有，你的程序应当再检查一下它是否可以通过修改一位（把0改为1，把1改为0）
	 * 来使它具有奇偶均势特性；如果不可能，这个矩阵就被认为是破坏了。
	 * 
	 * 输入 第一行是一个整数n ( 0< n < 100 )，代表该方阵的阶数。然后输入n 行，每行n个整数（0或1）。 输出
	 * 如果矩阵是布尔矩阵，输出“OK”；如果能通过只修改该矩阵中的一位来使它成为布尔矩阵，则输出“Change
	 * bit(i,j)”，这里i和j是被修改的元素的行与列（行，列号从0开始）；否则，输出“Corrupt”。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[][] = new int[n][n];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				int temp = scan.nextInt();
				a[i][j]=temp;
			}
		}

		
		int i,j,sum1=0,sum2=0,temp1=0,temp2=0;
		int flag1=0,flag2=0,count1=0,count2=0;
		/*
		 * 遍历行：每一行的和用sum1表示，如果sum1不是偶数，用flag1标记说明矩阵中存在总和不为偶数的行，temp1标记此行以便后续输出；
		 * count1用来统计矩阵中不符合条件的行的总数；每行遍历后要将sum1重新赋值为零
		 */
		for(i=0;i<n;i++)
		{
			sum1=0;
			for(j=0;j<n;j++)
			{
				if(a[i][j]==1)
				sum1++;
			}
			if(sum1%2!=0)
			{
				flag1=1;
				temp1=i;
				count1++;
			}
		}
	/*	遍历列：每一列的和用sum2表示，如果sum2不是偶数，用flag2标记说明矩阵中存在总和不为偶数的列，temp2标记此列以便后续输出；count2用来统计矩阵中不符合条件的行的总数；每列遍历后要将sum2重新赋值为零*/
		for(j=0;j<n;j++)
		{
			sum2=0;
			for(i=0;i<n;i++)
			{
				if(a[i][j]==1)
				{
					sum2++;	
				}
			}
			if(sum2%2!=0)
			{
				flag2=1;
				temp2=j;
				count2++;
			}
		}
		/*所有行、列都符合条件*/
		if(flag1==0&&flag2==0)
		{
			System.out.println("OK");
		}
		/*只有一列、一行不符合条件，可以通过修改一位来使它具有奇偶均势特性（因为矩阵中任何一个数字改动，都会直接影响这个数字所在的行和列*/
		else if(count1==1&&count2==1)
		{
			System.out.println("Change bit("+temp1+","+temp2+")");
		}
		/*矩阵是被破坏了的*/
		else
		System.out.println("Corrupt");
	}
}
