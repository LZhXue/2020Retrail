import java.util.Scanner;

public class ReverseSort_1060 {

	/*
	 * 输入一个正整数，将其逆序输出，每个数字后有一个空格。
	 * 
	 * 输入 
	 * 输入一个正整数n，你可以假设n在int范围内 
	 * 
	 * 输出
	 * 将n按其逆序输出，每个数字后有一个空格，输出占一行。例如，输入12354，输出4 5 3 2 1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(Integer.valueOf(str.charAt(i)-48)+" ");
		}
	}

}
