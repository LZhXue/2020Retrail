import java.util.Scanner;

public class SortTwoNumber_1020 {

	/*
	 * �Ӽ���������������x,y������С�����˳��������ǵ�ֵ�� 
	 * ���� 
	 * ������������x,y��
	 * 
	 * ��� 
	 * ����С�����˳��������ǵ�ֵ������֮���Կո�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x<y) {
			System.out.println(x+" "+y);
		}else {
			System.out.println(y+" "+x);
		}
	}

}
