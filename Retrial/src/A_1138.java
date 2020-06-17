import java.util.Scanner;

public class A_1138 {
	/*
	 * 题目描述 
	 * 输入一个字符串，判断其是否是C的合法标识符。
	 * C语言中规定标识符只能由字母、数字和下划线3种字符组成，且第一个字符必须为字母或下划线。 
	 * 
	 * 输入
	 * 输入一个长度不超过50的字符串。 
	 * 
	 * 输出 如果输入数据是C的合法标识符，则输出"yes"，否则，输出“no”。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean first = true;
		boolean flag = true;
		if(str.charAt(0)=='_'||Character.isLetter(str.charAt(0))) {
			for(int i = 1;i<str.length();i++) {
				if(str.charAt(i)=='_'||Character.isLetter(str.charAt(i))||Character.isDigit(str.charAt(i))) {
					continue;
				}else {
					flag = false;
				}
			}
		}else {
			first = false;
		}
		if(first&&flag) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
