import java.util.Scanner;

public class GetBirthday_1087 {
	/*
	 * ��Ŀ���� ����ĳ�˵�18λ���֤�ţ������������ڡ�
	 * 
	 * ���� ��ʵ�����ԡ���������һ������n����ʾ����ʵ���ĸ�����Ȼ����n�У�ÿ����һ��18λ���֤�š�
	 * 
	 * ��� ���������ÿ�����֤�ţ����һ�У������Ӧ�ĳ������ڣ������ʽΪ��yyyy-mm-dd��
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();//����һ���س�
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			System.out.println(str.substring(6, 10) + "-" + str.substring(10, 12) + "-" + str.substring(12, 14) );

		}
	}

}
