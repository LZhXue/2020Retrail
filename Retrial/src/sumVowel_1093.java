import java.util.Scanner;

public class sumVowel_1093 {
	/**
	 * 输入一个字符串，统计其中元音字母的个数。要求使用函数vowel()用来判断是否为元音,其余功能在main()函数中实现。
	 *  int vowel(char ch) { //如果ch是元音，返回1，否则返回0 }
	 *  输入一个字符串，长度不超过1000，以回车符结束。
	 *  输出一个整数，表示元音字母个数。输出单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();//双引号里面的ASCII字符最多只能有 65534 个
		int len = str.length();
		int sum = 0;
		for(int i = 0;i<len;i++) {
			if(vowel(str.charAt(i))==1) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
	public static int vowel (char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return 1;
		}
		return 0;
	}

}
