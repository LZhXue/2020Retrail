import java.util.Scanner;

public class DengChaShuLieAdd1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��Ŀ���� 
		 * ���������������ֱ��ʾ�Ȳ����еĵ�һ����һ��͹��������еĺ͡�
		 * 
		 * ���� ��������������֮���ÿո��������1������Ϊ�����2������Ϊĩ���3������Ϊ���
		 * 
		 * ��� ���ռһ�У�����һ��������Ϊ�õȲ����еĺ�
		 */
		int x,y,z;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();//����
		y = scan.nextInt();//ĩ��
		z = scan.nextInt();//����
		System.out.println((x+y)*((y-x)/z+1)/2);

	}

}
