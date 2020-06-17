import java.util.Scanner;

public class A_1130 {
	/*
	 * 题目描述 
	 * 还记得中学时候学过的杨辉三角吗？
	 * 
	 * 输入 
	 * 输入只包含一个正整数n（1 <= n <= 30），表示将要输出的杨辉三角的层数。
	 * 
	 * 输出 
	 * 输出相应层数的杨辉三角，每一层的整数之间用一个空格隔开。
	 */
	public static void main(String[] args) {
		//定义输出杨辉三角的行数
        int row;
        Scanner scan = new Scanner(System.in);
        row = scan.nextInt();
        //定义杨辉三角的行列数
        int [][] tr = new int[row][];
        for(int i=0;i<tr.length;i++){
            tr[i] = new int[i+1];
        }
        //输出杨辉三角的每一行第一个元素和最后一个元素和中间的元素
        for(int i=0;i<tr.length;i++){
            for(int j=0;j<tr[i].length;j++){
                tr[i][0] = 1;
                tr[i][tr[i].length-1] = 1;
                if(i>1 && j != 0 && j<i){        //排除每一行的第一个元素和最后一个元素
                    tr[i][j] = tr[i-1][j-1] +tr[i-1][j];        //杨辉三角中间元素的公式
                }
            }
        }
        //输出杨辉三角
        for(int i=0;i<tr.length;i++){
            for(int j=0;j<tr[i].length;j++){
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
	}

}
