import java.util.Scanner;

public class RightTriangleJudge_1030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		if((x*x+y*y==z*z)||(x*x+z*z==y*y)||(y*y+z*z==x*x)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
