import java.util.Scanner;

public class JuLi_1084 {
	/*
	 * 题目描述 
	 * 入两点坐标（X1,Y1）,（X2,Y2）,计算并输出两点间的距离。 
	 * 
	 * 输入
	 * 输入数据有多组，每组占一行，由4个实数组成，分别表示x1,y1,x2,y2,数据之间用空格隔开。 
	 * 
	 * 输出 
	 * 对于每组输入数据，输出一行，结果保留两位小数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double dis = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			System.out.printf("%.2f\n",dis);
		}
	}

}
