import java.util.Scanner;

public class AddAB_1079 {

	/*
	 * 题目描述 
	 * 计算A+B 
	 * 
	 * 输入 
	 * 输入数据有多组。 每组一行，为整数A, B。 
	 * 
	 * 输出 
	 * 对每行输入，输出A+B的值，单独占一行。
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
	}

}
