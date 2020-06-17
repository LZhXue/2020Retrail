import java.util.Scanner;

public class JudgeChar_1026 {
	/*
	 * 从键盘输入一个字符，判断该字符是否大写字母、小写字母、数字字符或其他字符。分别输出对应的提示信息。 
	 * 
	 * 输入 
	 * 输入一个字符。 
	 * 
	 * 输出
	 * 如果该字符是大写字母，则输出“upper”；若是小写字母，则输出“lower”；若是数字字符，则输出“digit”；若是其他字符，则输出“other”。（
	 * 输出不含双引号）。
	 */	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 String wait = scan.nextLine();
		 char ch = wait.charAt(0);
		 if(ch<='z'&&ch>='a') {
			 System.out.println("lower");
		 }else if(ch<='Z'&&ch>='A') {
			 System.out.println("upper");
		 }else if(ch<='9'&&ch>='0') {
			 System.out.println("digit");
		 }else {
			 System.out.println("other");
		 }
	}

}
