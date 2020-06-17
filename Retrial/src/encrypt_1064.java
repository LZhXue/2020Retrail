import java.util.Scanner;

public class encrypt_1064 {
	/*
	 * 题目描述 
	 * 从键盘输入一批字符，以@结束，按要求加密并输出。 
	 * 
	 * 输入 从键盘输入一批字符，占一行，以@结束。 
	 * 
	 * 输出 输出占一行 加密规则:
	 * 1）所有字母均转换为小写。
	 * 2）若是字母'a'到'y'，则转化为下一个字母。
	 * 3）若是'z'，则转化为'a'。 
	 * 4）其它字符，保持不变。
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char str[] = scan.nextLine().toLowerCase().split("@")[0].toCharArray();
		for(int i = 0;i<str.length;i++) {
			if(str[i]=='z') {
				str[i] ='a';
			}else if(str[i]>='a'&&str[i]<='y') {
				str[i]++;
			}
			System.out.print(str[i]);
		}
		
		
	}

}
