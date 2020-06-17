import java.util.Scanner;

public class SumChar_1066 {

	/*
	 * 输入一行字符，以回车符作为输入结束的标志。
	 * 统计其中英文字母、数字字符和其他字符的个数。 
	 * 
	 * 输入
	 * 多个字符，以回车符结束，回车符不作为有效字符。有效字符个数不超过100。 
	 * 
	 * 输出 
	 * 输出分3行，格式见输出样例。
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int letter = 0,digit = 0,other = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				letter++;
			}else if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				digit++;
			}else {
				other++;
			}
		}
		System.out.println("letter:"+letter);
		System.out.println("digit:"+digit);
		System.out.println("other:"+other);
	}

}
