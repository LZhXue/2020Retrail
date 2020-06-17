import java.util.Scanner;

public class MaxOfThree_1021 {
	//从键盘输入三个整数x,y和z，求出其中最大的数。

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		System.out.println(Math.max(Math.max(x, y),z));
	}

}
