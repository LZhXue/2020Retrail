import java.util.Scanner;

public class A_1232 {
	/*
	 * ��ѧУ���Ͼ�ɽ��԰����n(1<=n<=20)վ·��birdfly���ϳ�ʱ������m���ˣ�ÿ��һվ����pi�����ϳ���qi�����³�
	 * ����һ·�Ϲ���������ж����ˡ�(0<=m, pi ,qi <=50).
	 * 
	 * ���� 
	 * �����ж���������ÿ��������һ��������n m��������n��ÿ��������pi��qi��
	 * 
	 * ��� 
	 * ÿ��ʵ�������һ·�ϣ������ϳ�վ����³�վ�㣩������������������ÿ��ʵ�����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int max = m;
			for(int i = 0;i<n;i++) {
				int shang = scan.nextInt();
				int xia = scan.nextInt();
				m = m+shang-xia;
				if(m>max) {
					max = m;
				}
			}
			System.out.println(max);
		}
	}

}
