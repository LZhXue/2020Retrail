import java.util.Scanner;

public class AMonthHasDays_1036 {
	/*
	 * ����һ����ݺ��·ݣ�������ж����� 
	 * 
	 * ���� һ����ݣ�����������һ���·ݣ�1-12�����м���һ���ո���� 
	 * 
	 * ��� ���µ�����������ռһ�С�
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
