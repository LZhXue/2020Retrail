import java.util.Scanner;

public class TriangleJudge_1029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		if((x+y>z)&&(x+z>y)&&(y+z>x)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
