import java.util.Scanner;

public class JudgeXiangXian_2031 {

	/*
	 * ��������2������x��yֵ����ʾƽ����һ������㣬�жϸ�����㴦�ڵڼ����ޣ��������Ӧ�Ľ���� 
	 * 
	 * ����
	 * ����x��yֵ��ʾһ������㡣����㲻�ᴦ��x���y���ϣ�Ҳ������ԭ�㡣
	 * 
	 * ��� 
	 * �����Ӧ�����ޣ�������1,2,3,4�ֱ��Ӧ�ĸ����ޡ�>
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
