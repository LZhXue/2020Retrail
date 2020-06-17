import java.util.Scanner;

public class A_1208 {
	/*
	 * 题目描述 
	 * 话说辽军与MCA相峙多年,终于在一个秋日的早晨爆发了一次大规模的冲突.情况是这样子的,当天上午,由耶律-Pacision领军的辽军忽然带领数万人马浩浩荡荡向MCA山杀来,而这时候驻扎在MCA防守前线的是久经沙场的老将纪哥.
	 * 纪哥得知这个消息,立刻召集手下精英,前往阻击辽军.现已知辽军前进速度 U 米/秒 ,纪哥 速度 V 米 /秒 ,两军一开始相距S米,战地记者从两军刚开始进军就立刻开始以 W
	 * 米/秒的速度马不停蹄地往返于两军之间作第一时间的报道,即一到达一方,立刻返回前往另一方.问,当两军交锋之时,战地记者总共走的路程.
	 * 
	 * 输入 首先输入一个t,表示有t组数据，跟着t行： 每行有四个实数 u, v, w, s分别表示辽军速度,纪哥速度,记者速度,以及起始的距离.
	 * 
	 * 输出 输出一行实数表示总的路程.精确到小数点后3位.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0;i<t;i++) {
			double u = scan.nextDouble();
			double v = scan.nextDouble();
			double w = scan.nextDouble();
			double s = scan.nextDouble();
			double time = s/(u+v);
			double totalDistance = time*w;
			System.out.printf("%.3f\n",totalDistance);
		}

	}

}
