import java.util.Scanner;

public class A_1137 {
	/*
	 * 题目描述 
	 * 对于输入的字符串，查找其中的ASCII码值最大字母，在该字母后面插入字符串“(max)”。 
	 * 
	 * 输入
	 * 输入一行长度不超过200的字符串组成，字符串仅由大小写字母构成。 
	 * 
	 * 输出
	 * 输出的结果是插入字符串“(max)”后的结果，如果存在多个最大的字母，就在每一个最大字母后面都插入"(max)"。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		int max = -1;
		int len = str.length();
		for(int i = 0;i<len;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<len;i++) {
			sb.append(arr[i]);
			if(arr[i]==max) {
				sb.append("(max)");
			}
		}
		System.out.println(sb.toString());
	}

}
