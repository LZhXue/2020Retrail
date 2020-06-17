import java.util.Scanner;

public class A_1223 {
	/*
	 * 题目描述
	 * 一天crazy_snail正在读英文书，突发奇想，他想看一下自己的名字“snail”中每个字母在文章中出现的次数的总和占文章总长度的百分比
	 * （即’s’,’n’,’a’,’i’,’l’,在给定的字符串中出现的个数总和占总长度的百分比，小数部分直接舍去）。
	 * 
	 * 输入 
	 * 第一行输入一个n表示有n组测试实例。n为整数。 其下有n行，每行一组测试实例； 每组测试实例包括一个长度不超过200的字符串，且字符串中出现的字符都为小写字母。
	 * 
	 * 
	 * 输出 
	 * 每组实例输出其对应的百分比（按照“55%”的格式输出），且每组输出占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
//		for(int i = 0;i<n;i++) {
//			String str = scan.nextLine();
//			String substr = "snail";
//			double sum = 0;
//			for(int j = 0;j<str.length()-4;j++) {
//				boolean flag = true;
//				if(str.charAt(j)==substr.charAt(0)) {
//					for(int k = 0;k<substr.length();k++) {
//						if(str.charAt(j+k)!=str.charAt(k)) {
//							flag = false;
//							break;
//						}
//					}
//					if(flag) {
//						sum++;
//					}
//				}
//			}
//			double rate = sum*5/str.length();
//			int result = (int) (rate*100);
//			if(str.length()<substr.length()) {
//				result = 0;
//			}
//			System.out.println(result+"%");
//		}
		for(int i = 0;i<n;i++) {
			String str = scan.nextLine();
			double sum = 0;
			for(int j = 0;j<str.length();j++) {
				if(str.charAt(j)=='s'||str.charAt(j)=='n'||str.charAt(j)=='a'||str.charAt(j)=='i'||str.charAt(j)=='l') {
					sum++;
				}
			}
			double rate = sum/str.length();
			int result = (int) (rate*100);
			System.out.println(result+"%");
		}
	}

}
