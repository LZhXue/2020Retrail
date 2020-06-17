import java.util.ArrayList;
import java.util.Scanner;

public class A_1139 {

	/*
	 * 题目描述 
	 * 输入n和n个字符串，输出其中最短的字符串。若长度相同则输出出现较早的那一个。
	 * 
	 * 输入 
	 * 第一行是一个整数n，后面跟着n行，每行包括一个由字母和数字和空格组成的字符串，长度不超过1000。
	 * 
	 * 输出 
	 * 长度最短的字符串，若长度相同则输出出现较早的那一个。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList al = new ArrayList();
		int min = 1000;
		int index = -1;
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String str = scan.nextLine();
			if(min>str.length()) {
				min = str.length();
				index = i;
			}
			al.add(str);
		}
		System.out.println(al.get(index));
	}

}
