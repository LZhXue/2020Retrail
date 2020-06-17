import java.util.Scanner;

public class AMonthHasDays_1036 {
	/*
	 * 给你一个年份和月份，求该月有多少天 
	 * 
	 * 输入 一个年份（正整数），一个月份（1-12），中间有一个空格隔开 
	 * 
	 * 输出 该月的天数，单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		int monthArray[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(isRunYear(year)&&month==2) {
			System.out.println(29);
		}
		else {
			System.out.println(monthArray[month]);
		}
		
	}
	public static boolean isRunYear(int year) {
		if((year%4==0&&year%100!=0)||year%400==0) {
			return true;
		}else {
			return false;
		}
	}
}
