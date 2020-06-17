import java.util.Scanner;

public class A_1131 {
	/*
	 * 题目描述 
	 * 英文字母里出现频率最高的是哪个字母呢? 给定一个字符串，输出字符串中出现次数最多的字母。
	 * 
	 * 输入 
	 * 输入一个只含有大小写字母和空格的字符串，长度不超过100，以回车结束。
	 * 
	 * 输出 
	 * 输出一个小写字母，表示该字符串中出现次数最多的字母。若答案有多个，则只输出ASCII码最小的那个。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int arr[] = new int[26];//a的ASCII是97，空格是32
		for(int i = 0;i<str.length();i++) {
			int aa = str.charAt(i);
			if(aa ==' ') {
				continue;
			}else {
				arr[aa-97]++;
			}
		}
		int max = arr[0];
		int index = 0;
		for(int i = 1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		char aa = (char) (index+97);
		System.out.println(aa);
	}

}
