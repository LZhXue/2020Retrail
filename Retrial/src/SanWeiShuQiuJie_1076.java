import java.util.Scanner;

public class SanWeiShuQiuJie_1076 {

	/*
	 * ��֪xyz+yzz=n������n��һ����������x��y��z�������֣�0-9����
	 * ��дһ���������x��y��z�ֱ����ʲô���֡�����޽⣬�������No Answer�� 
	 * ע�⣺xyz��yzz��ʾһ����λ���������Ǳ�ʾx*y*z��y*z*z�� 
	 * 
	 * ���� 
	 * ����һ��������n�� 
	 * 
	 * ���
	 * ���һ�У�����x��y��z��ֵ��ÿ����ֵռ4�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag = 0;
		for(int x = 1;x<=9;x++) {
			for(int y = 1;y<=9;y++) {
				for(int z = 0;z<=9;z++) {
					if(x*100+y*10+z+z+z*10+y*100==n) {
						flag = 1;
						System.out.printf("%4d%4d%4d",x,y,z);
					}
				}
			}
		}
		if(flag==0) {
			System.out.println("No Answer");
		}
	}

}
