import java.util.Scanner;

public class ZhengShuMi_1005 {

	/*
	 * ����3��������������ǵ�1���ݡ�2���ݺ�3���ݡ� ����3�������ÿո������
	 * ���3�У�ÿ��3���������ֱ������ǵ�1���ݡ�2���ݺ�3���ݣ�ÿ������ռ9�У�����9������롣
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,z;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		scan.close();
		System.out.printf("%-9d%-9d%-9d\n",x,x*x,x*x*x);//ÿ������ռ9�У�����9�������
		System.out.printf("%-9d%-9d%-9d\n",y,y*y,y*y*y);
		System.out.printf("%-9d%-9d%-9d\n",z,z*z,z*z*z);
	}

}
