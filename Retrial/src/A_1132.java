import java.util.Scanner;

public class A_1132 {

	/*
	 * 对于给定的一个字符串，统计其中数字字符出现的次数。字符串长度不超过1000. 
	 * 
	 * 输入
	 * 输入数据有多行，第一行是一个整数n，表示测试实例的个数，后面跟着n行，每行包括一个由字母和数字组成的字符串。 
	 * 
	 * 输出
	 * 对于每个测试实例，输出该串中数字字符的个数，每个输出占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String str = scan.nextLine();
			int sum = 0;
			for(int j = 0;j<str.length();j++) {
				if(Character.isDigit(str.charAt(j))) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

}
