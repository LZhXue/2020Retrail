import java.util.Scanner;

public class FenDuanHanShu_1035 {
	
	/*
	 * ��֪��y��x�ĺ���, 
	 * ��x<-2ʱ��y=7-2x�� 
	 * ��x>=-2,��x<3ʱ��y=5-|3x+2|��
	 * ��x>=3ʱ��y=3x+4 
	 * 
	 * ����
	 * ��������һ������x�� 
	 * 
	 * ��� 
	 * ���Ϊһ����������x��Ӧ�ĺ���ֵ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = 0;
		if(x<-2) {
			y = 7-2*x;
		}else if(x>=-2&&x<3) {
			if(3*x+2>0) {
				y = 5-(3*x+2);
			}else {
				y = 5+(3*x+2);
			}
		}else if(x>=3) {
			y = 3*x+4;
		}
		System.out.println(y);
	}

}
