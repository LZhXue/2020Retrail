import java.util.Scanner;

public class LuckyNumber_1056 {

	/*
	 * С����ĳЩ������ƫ�������磬��ϲ��7�ı���������ϲ��4�ı��������һ��������7�ı�����������4�ı�����С������Ϊ��������������������֡�
	 * ���ڸ�����������m��n�������С����m��n��Χ�ڵ������������֡����m��n��Χ��û���������֣��������no�� 
	 * 
	 * ���� 
	 * ����������m��n��m <=n���Ҿ�С��10��9�η��� 
	 * 
	 * ��� 
	 * һ����������m��n��Χ�ڵ������������֡�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int flag = 0;
		for(int i = n;i>=m;i--) {
			if(i%7==0&&i%4!=0) {
				flag = 1;
				System.out.println(i);
				break;
			}
		}
		if(flag==0) {
			System.out.println("no");
		}
	}

}
