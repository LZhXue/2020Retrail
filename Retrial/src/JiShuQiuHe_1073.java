import java.util.Scanner;

public class JiShuQiuHe_1073 {

	/*
	 * 已知：Sn= 1＋1／2＋1／3＋…＋1／n。显然对于任意一个整数K，当n足够大的时候，Sn大于K。
	 * 现给出一个整数K（1<=k<=15），要求计算出一个最小的n；使得Sn＞K。
	 * 
	 *  输入 
	 *  键盘输入 k 
	 *  
	 *  输出 
	 *  屏幕输出 n
	 */public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 int k = scan.nextInt();
		 double sn = 0;
		 double fm = 1;
		 while(sn<=k) {
			 sn = sn+1/fm;
			 fm++;
		 }
		 System.out.printf("%.0f",fm-1);
	}

}
