import java.util.Scanner;

public class A_1133 {

	/*
	 * 从键盘输入一行字符，长度小于1000。统计其中单词的个数，各单词以空格分隔，且空格数可以是多个。
	 * 
	 * 输入 输入只有一行句子。仅有空格和英文字母构成
	 * 
	 * 输出 单词的个数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] ch = new char[1010];
		int i, num, k = 0, sum = 0;
		num = s.length();
		ch = s.toCharArray();
		for (i = 0; i < num; i++) {
			if (Character.isUpperCase(ch[i]) || Character.isLowerCase(ch[i]))
				// 如果是字母
				k++;
			else // 如果不是字母
			{
				if (k != 0)// 之前是单词
				{
					sum++;
					k = 0;
				}
			}
		}
		if (k != 0)
			sum++;
		System.out.println(sum);
		scan.close();
	}

}
