import java.util.ArrayList;
import java.util.Scanner;

public class CarLocation_1070 {
	/*
	 * 题目描述 有一辆智能小车，最初（时间为0)的位置为(0,0)，我们想知道它最后的位置。
	 * 小车以每小时10公里的速度向北移动（以北为y轴正向，以东为x轴正向）。
	 * 小车会受到一系列依照时间戳记排序的命令，1表示“向左转”，2表示“向右转”，3表“停止”。 每个命令的前面有一个时间戳记，所以我们知道该命令是何时发出的。
	 * 最后一个命令一定是“停止”。我们另外假设，这辆小车非常灵活，它可以在瞬间转弯。
	 * 以下列输入为例。小车在时间为5的时候收到一个“向左转”的命令1，在时间10收到一个“向右转”的命令2，在时间15收到一个“停止”的命令3。
	 * 那么在最后时间15的时候，小车的位置将在（-50,100）。程序只要求输出小车最后的位置，第一个整数是x坐标，第二个整数是y坐标。
	 * 
	 * 输入
	 * 输入包含多个命令，每个命令由整数time和command组成，表示在时刻time发出命令command。command的取值范围1-3，含义如上所述。
	 * 
	 * 输出 输出占一行，包含两个整数，表示小车的最终位置。两个整数之间由空格隔开。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int time1=0;
//		int commond1=0;
//		int x=0,y=0;
////		0 上 1 左 2 下 3 右
//		int direct=0;
//		
//		while(true) {
//			int time2 = scan.nextInt();
//			int command2 = scan.nextInt();
//			
//			if(commond1==0)
//			{
//				int road=(time2-time1)*10;
//				y=y+road;
//				if(command2==1) {
//					direct=(direct+4+1)%4;
//				}
//				else {
//					direct=(direct+4-1)%4;
//				}
//			}else {
//				if(direct%4==1)
//				{
//					x=x-(time2-time1)*10;
//				}else if(direct%4==2)
//				{
//					y=y-(time2-time1)*10;
//				}else if(direct%4==3)
//				{
//					x=x+(time2-time1)*10;
//				}else if(direct%4==0)
//				{
//					y=y+(time2-time1)*10;
//				}
//				
//				if(command2==1) {
//					direct=(direct+4+1)%4;
//				}
//				else {
//					direct=(direct+4-1)%4;
//				}
//				
//			}
//			
//			commond1=command2;
//			time1=time2;
//			
//			if(command2==3)
//			{
//				break;
//			}
//			
//			
//			
//			
//		}
//		System.out.println(x+" "+y);	
//		
//		
		
		
		
		Scanner scan = new Scanner(System.in);
		int time1 = 0;
		int command1 = 0;
		int time2 = scan.nextInt();
		int command2 = scan.nextInt();
		int x = 0, y = (time2-time1)*10;
		int direct = 0;// 控制方向
		if(command2==1) {
			direct = (direct + 4+1) % 4;
		}else if(command2==2) {
			direct = (direct+ 4 - 1) % 4;
		}
		while (command2!=3) {
			if(direct==0) {
				y = y + (time2 - time1) * 10;
			}else if(direct==1) {
				x = x - (time2 - time1) * 10;
			}else if(direct==2) {
				y = y - (time2 - time1) * 10;
			}else if(direct==3) {
				x = x + (time2 - time1) * 10;
			}
			
			time1 = time2;
			time2 = scan.nextInt();
			command1 = command2;
			command2 = scan.nextInt();
			
			if(command2==1) {
				direct = (direct +4+ 1) % 4;
			}else if(command2==2) {
				direct = (direct+4 - 1) % 4;
			}else if(command2==3) {
				
				break;
			}

		}
		System.out.println(x+" "+y);	
	}

}
