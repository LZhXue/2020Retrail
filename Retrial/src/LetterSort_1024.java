import java.util.Scanner;

public class LetterSort_1024 {
	/*
	 * 题目描述 
	 * 输入一个英文字母（可能是大写，也可能是小写），输出该字母在字母表中的序号（’a’和’A’的序号为1）。 
	 * 
	 * 输入 
	 * 输入只有一个英文字母。 
	 * 
	 * 输出
	 * 输出一个整数，表示该字母在字母表的序号，输出单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char ch = str.toUpperCase().charAt(0);
		int xx = (int) ch;
		System.out.println(xx-64);
		
	}

}
