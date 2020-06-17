import java.util.Arrays;
import java.util.Scanner;

public class ASC_1086 {
	/*
	 * 题目描述 
	 * 输入三个字符后，按各字符的ASCII码从小到大的顺序输出这三个字符。 
	 * 
	 * 输入 
	 * 输入数据有多组，每组占一行，有三个字符组成，之间无空格。 
	 * 
	 * 输出
	 * 对于每组输入数据，输出一行，字符中间用一个空格分开。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String str = scan.nextLine();
			char c[] = new char[3];
			c = str.toCharArray();
			Arrays.parallelSort(c);
			System.out.println(c[0]+" "+c[1]+" "+c[2]);
		}
	}

}
