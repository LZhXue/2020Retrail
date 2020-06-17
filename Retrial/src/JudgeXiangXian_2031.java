import java.util.Scanner;

public class JudgeXiangXian_2031 {

	/*
	 * 键盘输入2个整数x、y值，表示平面上一个坐标点，判断该坐标点处于第几象限，并输出相应的结果。 
	 * 
	 * 输入
	 * 输入x，y值表示一个坐标点。坐标点不会处于x轴和y轴上，也不会在原点。
	 * 
	 * 输出 
	 * 输出对应的象限，用数字1,2,3,4分别对应四个象限。>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x>0&&y>0) {
			System.out.println(1);
		}else if(x>0&&y<0) {
			System.out.println(4);
		}else if(x<0&&y>0) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}
	}

}
