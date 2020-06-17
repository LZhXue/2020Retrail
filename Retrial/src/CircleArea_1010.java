import java.util.Formatter;
import java.util.Scanner;

public class CircleArea_1010 {
	/*
	 * 题目描述 
	 * 输入圆的半径，求圆的周长和面积。 要求定义圆周率为如下宏常量 #define PI 3.14159
	 * 
	 * 输入 
	 * 输入半径r的值，为一实数。
	 *  
	 * 输出
	 * 输出一行，包括周长和面积。数据之间用一个空格隔开，数据保留小数后面两位。
	 */
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double zhouchang = 2*PI*r;
		double area = PI*r*r;
		Formatter fz = new Formatter().format("%.2f",zhouchang);
		Formatter fa = new Formatter().format("%.2f",area);
//		System.out.print(fz);
//		System.out.print(" ");
//		System.out.print(fa);
		System.out.println(fz+" "+fa);

	}

}
