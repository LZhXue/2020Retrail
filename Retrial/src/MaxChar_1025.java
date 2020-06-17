import java.util.Scanner;

public class MaxChar_1025 {
	/*
	 * 题目描述 
	 * 给你三个ASCII字符(不含空白字符:包括空格、制表符\t、回车换行符\n)，找出其中最大的那个 
	 * 
	 * 输入 
	 * 输入包含三个字符，之间有一个空格隔开。
	 * 
	 * 输出 
	 * 输出ASCII码最大的那个字符，占一行。
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int x = str.charAt(0);
		int y = str.charAt(2);
		int z = str.charAt(4);
		char ch =  (char)Math.max(z, Math.max(x, y));
		System.out.println(ch);
		
	}

}
