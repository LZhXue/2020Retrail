import java.util.Scanner;

public class DengChaShuLieAdd1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 题目描述 
		 * 给出三个整数，分别表示等差数列的第一项、最后一项和公差，求该数列的和。
		 * 
		 * 输入 输入三个整数，之间用空格隔开。第1个数作为首项，第2个数作为末项，第3个数作为公差。
		 * 
		 * 输出 输出占一行，包含一个整数，为该等差数列的和
		 */
		int x,y,z;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();//首项
		y = scan.nextInt();//末项
		z = scan.nextInt();//公差
		System.out.println((x+y)*((y-x)/z+1)/2);

	}

}
