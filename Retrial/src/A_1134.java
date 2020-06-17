import java.util.Scanner;

public class A_1134 {
	/*
	 * 题目描述 输入一个以回车结束的字符串，它由数字和字母组成，请过滤掉所有非数字字符，然后将数字字符串转换成十进制整数后乘以2输出。
	 * 
	 * 输入 
	 * 输入一个以回车结束的字符串，长度不超过100，由数字和字母组成。
	 * 
	 * 输出 
	 * 将转换后的整数乘以2输出，测试数据保证结果在int范围内。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int len = str.length();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sb.append(ch);
			}
		}
		//特别注意字符串转值时，空字符串会抛异常
		if(sb.length()==0) {
			sb.append('0');
		}
		System.out.println(2*Integer.valueOf(sb.toString()));
	}

}
