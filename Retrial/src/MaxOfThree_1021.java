import java.util.Scanner;

public class MaxOfThree_1021 {
	//�Ӽ���������������x,y��z�����������������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		System.out.println(Math.max(Math.max(x, y),z));
	}

}
