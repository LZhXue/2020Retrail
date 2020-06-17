import java.util.Scanner;

public class GetBirthday_1087 {
	/*
	 * 题目描述 输入某人的18位身份证号，输出其出生日期。
	 * 
	 * 输入 多实例测试。首先输入一个整数n，表示测试实例的个数，然后是n行，每行是一个18位身份证号。
	 * 
	 * 输出 对于输入的每个身份证号，输出一行，即其对应的出生日期，输出格式为：yyyy-mm-dd。
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();//读掉一个回车
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			System.out.println(str.substring(6, 10) + "-" + str.substring(10, 12) + "-" + str.substring(12, 14) );

		}
	}

}
