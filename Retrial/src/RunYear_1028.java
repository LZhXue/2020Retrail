import java.util.Scanner;

public class RunYear_1028 {
	/*
	 * 题目描述 
	 * 根据一个年份，判断是否是闰年。 
	 * 
	 * 输入 
	 * 输入为一个整数，表示一个年份。
	 * 
	 * 输出 
	 * 如果是闰年，输出"Yes"，否则输出"No"。输出单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	
		int year = scan.nextInt();
		/*
		 * 闰年的判断方法是：
		 *  1.可以被4整除,但不能被100整除   或者
		 *  2.可以被400整除
		 */
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
