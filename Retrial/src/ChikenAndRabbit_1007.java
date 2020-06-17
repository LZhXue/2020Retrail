import java.util.Scanner;

public class ChikenAndRabbit_1007 {
	/*
	 * 题目描述 
	 * 鸡和兔关在一个笼子里，鸡有2只脚，兔有4只脚，没有例外。
	 * 已知现在可以看到笼子里m个头和n只脚，求鸡和兔子各有多少只？
	 * 
	 * 输入 
	 * 输入两个整数m和n，分别代表笼子里头的个数和脚的个数。(假设m和n都在合法的数据范围内)
	 * 
	 * 
	 * 输出 
	 * 依次输出鸡和兔的只数。（数字为0的也要输出）
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m,n;
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt();
		System.out.print((4*m-n)/2);
		System.out.print(" ");
		System.out.println((n-2*m)/2);
	}

}
