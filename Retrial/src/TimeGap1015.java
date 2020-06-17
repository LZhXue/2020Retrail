import java.util.Scanner;

public class TimeGap1015 {
	/*
	 * 题目描述 
	 * 读入两个用“时:分:秒”表示的时间点，计算以秒为单位的时间间隔。
	 * 
	 * 输入 
	 * 输入有两行，每行是一个用“时:分:秒”表示的时间点。测试数据保证第二个时间点晚于第一个时间点。
	 * 
	 * 输出 
	 * 输出一个整数，表示时间间隔的秒数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String t1 = scan.nextLine();
		String t2 = scan.nextLine();
		String tt1[] = t1.split(":");//字符串分割
		String tt2[] = t2.split(":");
		int a1 = Integer.valueOf(tt1[0]);
		int b1 = Integer.valueOf(tt1[1]);
		int c1 = Integer.valueOf(tt1[2]);
		int a2 = Integer.valueOf(tt2[0]);
		int b2 = Integer.valueOf(tt2[1]);
		int c2 = Integer.valueOf(tt2[2]);//转化为整数
//		double cc = Double.valueOf(tt1[0]);  // 转化为小数
		int timeGap = (a2*3600+b2*60+c2)-(a1*3600+b1*60+c1);//统一单位
		System.out.println(timeGap);
	}

}
