import java.util.Scanner;

public class JudgeOddOrEven_1018 {
	/*
	 * ����һ���������жϸ�������������ż���� 
	 * ���� 
	 * ��������n��
	 * ��� 
	 * ��������������������odd����ż���������even�����������˫���ţ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		if(m%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

}
