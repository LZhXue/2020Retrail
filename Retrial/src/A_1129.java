import java.util.Scanner;

public class A_1129 {
	/*
	 * ��Ŀ���� 
	 * ��֪����2012-1-1�Ǹ���ĵ�1�죬��9999-9-9�أ�����һ����������ڣ�����������Ǹ���ĵڼ��졣
	 * 
	 * ���� 
	 * ����һ�����ڣ���ʽΪ��Year-month-day��year��С��9999����������
	 * 
	 * ��� 
	 * һ��������
	 * ��ʾ�������Ǹ���ĵڼ��졣
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