import java.util.Scanner;

public class A_1136 {
	/*
	 * 题目描述 输入一个只包含大小写英文字母和空格的句子，将每个单词的第一个字母改成大写字母。
	 * 
	 * 输入 输入一个长度不超过100的英文句子。
	 * 
	 * 输出 请输出按照要求改写后的英文句子。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//a97,A65
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		for(int i =1;i<str.length();i++) {
			if(arr[i-1]==' '&&Character.isLowerCase(arr[i])) {
				int ch = arr[i]-32;
				arr[i] = (char)ch;
			}
		}
		if(Character.isLowerCase(arr[0])) {
			int ch = arr[0]-32;
			arr[0] = (char)ch;
		}
		System.out.println(String.valueOf(arr));
	}

}
