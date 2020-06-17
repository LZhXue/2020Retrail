import java.util.Scanner;

public class SumTime_1095 {
	/*
	 * 题目描述 
	 * 从键盘输入两个时间点(24小时制），输出两个时间点之间的时间间隔，时间间隔用“小时:分钟:秒”表示。要求程序定义如下两个函数，并在main()
	 * 中调用这两个函数实现相应的功能,其中main函数系统已经实现，你只需要完成下面这两个函数的定义。 
	 * int HmsToS(int h, int m, int s) // 三个参数分别为用于表示一个时间点的时、分、秒 { //把时分秒转换成秒并返回。 } 
	 * void PrintTime(int s); //形参s表示一个时间段的长度，单位是秒 { //将时间段转换为对应的“小时:分钟:秒” 格式输出 }
	 * 
	 * 输入
	 * 输入数据有多组。每组输入包括两行。第一行为时间点1，第二行为时间点2，时间点均以“HH:MM:SS”的格式输入。测试数据保证时间点1早于时间点2。 
	 * 
	 * 输出
	 * 对应每组数据，有一行输出，以“HH:MM:SS”的格式输出时间间隔。注意不足两位要补占位符0。格式参看输入输出。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String str1 = scan.nextLine();
			String time1[] = str1.split(":");
			int h1 = Integer.valueOf(time1[0]);
			int m1 = Integer.valueOf(time1[1]);
			int s1 = Integer.valueOf(time1[2]);
			
			String str2 = scan.nextLine();
			String time2[] = str2.split(":");
			int h2 = Integer.valueOf(time2[0]);
			int m2 = Integer.valueOf(time2[1]);
			int s2 = Integer.valueOf(time2[2]);
			
			int ss = HmsToS(h2,m2,s2)-HmsToS(h1,m1,s1);
			PrintTime(ss);
		}
	}
	
	public static int HmsToS(int h, int m, int s) {// 三个参数分别为用于表示一个时间点的时、分、秒,把时分秒转换成秒并返回。 
		
		return h*3600+m*60+s;
	} 
	
	public static void PrintTime(int s){//形参s表示一个时间段的长度，单位是秒 { //将时间段转换为对应的“小时:分钟:秒” 格式输出 }
		int h = s/3600;
		int m = s%3600/60;
		int s1 = s%60;
		String hs;
		String ms;
		String s1s;
		if(h<10) {
			hs = "0"+String.valueOf(h);
		}else {
			hs = String.valueOf(h);
		}
		if(m<10) {
			ms = "0"+String.valueOf(m);
		}else {
			ms = String.valueOf(m);
		}
		if(s1<10) {
			s1s = "0"+String.valueOf(s1);
		}else {
			s1s = String.valueOf(s1);
		}
		System.out.println(hs+":"+ms+":"+s1s);
	}

}
