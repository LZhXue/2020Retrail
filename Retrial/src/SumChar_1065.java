import java.util.Scanner;

public class SumChar_1065 {

	/*
	 * 输入一行字符，以回车符作为输入结束的标志。统计其中数字字符的个数。 
	 * 
	 * 输入 
	 * 多个字符，以回车符结束，回车符不作为有效字符。 
	 * 
	 * 输出
	 * 输出一个整数，表示数字字符的个数。
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int num = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)<='9'&&str.charAt(i)>='0') {
				num++;
			}
		}
		System.out.println(num);
	}

}
