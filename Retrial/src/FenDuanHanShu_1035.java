import java.util.Scanner;

public class FenDuanHanShu_1035 {
	
	/*
	 * 已知：y是x的函数, 
	 * 当x<-2时，y=7-2x； 
	 * 当x>=-2,且x<3时，y=5-|3x+2|；
	 * 当x>=3时，y=3x+4 
	 * 
	 * 输入
	 * 任意输入一个整数x。 
	 * 
	 * 输出 
	 * 输出为一个整数，即x对应的函数值。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = 0;
		if(x<-2) {
			y = 7-2*x;
		}else if(x>=-2&&x<3) {
			if(3*x+2>0) {
				y = 5-(3*x+2);
			}else {
				y = 5+(3*x+2);
			}
		}else if(x>=3) {
			y = 3*x+4;
		}
		System.out.println(y);
	}

}
