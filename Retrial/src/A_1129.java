import java.util.Scanner;

public class A_1129 {
	/*
	 * 题目描述 
	 * 你知道，2012-1-1是该年的第1天，而9999-9-9呢？给你一个具体的日期，计算该日期是该年的第几天。
	 * 
	 * 输入 
	 * 输入一个日期，格式为：Year-month-day。year是小于9999的正整数。
	 * 
	 * 输出 
	 * 一个整数，
	 * 表示该日期是该年的第几天。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String arr[] = str.split("-");
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		int mon[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isRun(year)) {
			mon[1] = 29;
		}
		int sum = 0;
		for(int i = 0;i<month-1;i++) {
			sum+=mon[i];
		}
		System.out.println(sum+day);
	}
	
	public static boolean isRun(int year) {
		if((year%4==0&&year%100!=0)||year%400==0) {
			return true;
		}else {
			return false;
		}
	}
}