import java.util.Formatter;
import java.util.Scanner;

public class Distance_1013 {

	/*
	 * 题目描述
	 * 给定A(x1, y1), B(x2, y2)两点坐标，计算它们间的距离。
	 * 
	 * 输入
	 * 输入包含四个实数x1, y1, x2, y2，分别用空格隔开，含义如描述。其中0≤x1,x2,y1,y2≤100。
	 * 
	 * 输出 
	 * 输出占一行，包含一个实数d，表示A, B两点间的距离。结果保留两位小数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double dis = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		Formatter fdis = new Formatter().format("%.2f",dis);
		System.out.println(fdis);
	}

}
