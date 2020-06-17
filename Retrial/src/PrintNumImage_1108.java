import java.util.Scanner;

public class PrintNumImage_1108 {

	/*
	 * ��Ŀ����
	 * �Ӽ�������һ������n(1��n��9),��ӡ��ָ��������ͼ�Ρ�Ҫ���ڳ����ж��岢�������º�����
	 * PrintSpace(m)�������m���ո�
	 * PrintDigit(m)�����һ���е����ִ�"12...m...21"�������е����������m����
	 * ����ԭ�����£� 
	 * void PrintDigit(int m); 
	 * void PrintSpace(int m);
	 * 
	 * ����
	 * ������n��1��n��9���� 
	 * 
	 * ��� 
	 * ָ������ͼ�Ρ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt()-1;
		for(int i = 0;i<n;i++) {
			PrintSpace(n-i);
			PrintDigit(i);
			System.out.println();
		}
		for(int i = 0;i<=n;i++) {
			PrintSpace(i);
			PrintDigit(n-i);
			System.out.println();
		}
	}
	
	public static void PrintDigit(int m) {
		int i =1;
		while(i<=m) {
			System.out.print(i);
			i++;
		}
		while(i>=1) {
			System.out.print(i);
			i--;
		}
	}
	public static void PrintSpace(int m) {
		for(int i = 0;i<m;i++) {
			System.out.print(" ");
		}
	}

}
