import java.util.Scanner;

public class A_1156 {
	/*
	 * 题目描述 
	 * 输入一个名词英语单词，按照英语语法规则把单数变成复数。规则如下： 
	 * （1） 以辅音字母y结尾，变y为i，再加es； 
	 * （2） 以s, x, ch, sh结尾，则加es； 
	 * （3） 以元音o结尾，则加es； 
	 * （4） 其他情况加上s。
	 * 
	 * 输入 
	 * 输入一个字符串，仅含小写字母，长度不超过20。
	 * 
	 * 输出 
	 * 输出其对应的复数形式。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		int len = sb.length();
		if(sb.charAt(len-1)=='y') {
			sb.replace(len-1, len, "ies");
		}else if(sb.charAt(len-1)=='o'||sb.charAt(len-1)=='s'||sb.charAt(len-1)=='x'||(sb.charAt(len-2)=='c'&&sb.charAt(len-1)=='h')||(sb.charAt(len-2)=='s'&&sb.charAt(len-1)=='h')) {
			sb.append("es");
		}else {
			sb.append("s");
		}
		System.out.println(sb.toString());
	}

}
