import java.util.Scanner;

public class CancelTicket {

	/*
	 * 票面乘车站开车时间前48小时以上的按票价5%计退票费。
	 * 同时，车票退票费的计算方法不再四舍五入到元为单位，而是以5角为单位：尾数小于0.25元的舍去、
	 * 不小于0.25元且小于0.75元的计为0.5元、不小于0.75元的进为1元。编写一个函数，计算退票费，假定退票时间举例开车时间在48小时以上。
	 * 函数原型如下： double CancelFee(double price); 输入 输入一个实数，表示火车票票面价格。 输出
	 * 输出一个实数，表示退票费，结果保留一位小数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double cost = scan.nextDouble();
		System.out.printf("%.1f",CancelFee(cost));
	}
	public static double CancelFee(double price) {
		double cost = price*0.05;
		double zh = Math.floor(cost);
		double rear = cost- zh;
		if(rear<0.25) {
			return zh;
		}else if(rear<0.75&&rear>=0.25) {
			return 0.5+zh;
		}else {
			return 1+zh;
		}
	}
}
