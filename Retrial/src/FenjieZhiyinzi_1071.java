import java.util.Scanner;

public class FenjieZhiyinzi_1071 {

	/*
	 * ��Ŀ���� ��һ���������ֽ������������磬����90�����2 3 3 5��
	 * 
	 * ���� ����һ��������n��2<=n<=2000����
	 * 
	 * ��� ��С�������n�����������ӣ�ÿ������֮���һ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 1) {
			for (int i = 2; i <= n; i++) {
				if (isSuShu(i) && n % i == 0) {
					n = n/i;
					System.out.print(i + " ");
					break;
				}
			}
		}
	}

	public static boolean isSuShu(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
