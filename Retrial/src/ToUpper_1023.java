import java.util.Scanner;

public class ToUpper_1023 {

	/*
	 * 题目描述 
	 * 输入一个字母，若是小写字母，则变为大写输出，否则，原样输出。 
	 * 
	 * 输入 
	 * 输入为一个字符。 
	 * 
	 * 输出 
	 * 按题目要求输出一个字符，单独占一行。
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String m = scan.nextLine();
//		Java中没有提供方法直接从键盘接收一个字符,
//		但是可以用从键盘接收一个字符串实现接收一个字符的功能。
		char ch = m.toUpperCase().charAt(0);
		System.out.println(ch);
		
	}

}
