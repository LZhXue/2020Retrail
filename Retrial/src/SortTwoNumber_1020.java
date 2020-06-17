import java.util.Scanner;

public class SortTwoNumber_1020 {

	/*
	 * 从键盘输入两个整数x,y，按从小到大的顺序输出它们的值。 
	 * 输入 
	 * 输入两个整数x,y。
	 * 
	 * 输出 
	 * 按从小到大的顺序输出它们的值。数据之间以空格间隔。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x<y) {
			System.out.println(x+" "+y);
		}else {
			System.out.println(y+" "+x);
		}
	}

}
