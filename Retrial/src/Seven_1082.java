import java.util.Scanner;

public class Seven_1082 {

	/*
	 * ��Ŀ���� ���7��7�ı��������а���7���������磨17��27��37...70��71��72��73...��
	 * 
	 * ���� ��������һ������t����ʾ��t�����ݡ� Ȼ����t�У�ÿ��һ������N��(N������30000)
	 * 
	 * ��� ����ÿ�����ݣ������С�������еĲ�����N����7�йص����֡�ÿ������ռһ�У�ÿ�����ֺ�����һ���ո�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			for (int j = 1; j <=n; j++) {
				if (j % 7 == 0) {
					System.out.print(j + " ");
				} else {
					int temp = j;
					while (temp > 0) {
						if (temp % 10 == 7) {
							System.out.print(j + " ");
							break;
						}
						temp = temp / 10;
					}
				}
				if(j==n) {
					System.out.println();
				}
				
			}
		}
	}

}
