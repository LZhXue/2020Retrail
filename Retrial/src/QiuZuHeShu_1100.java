import java.util.Scanner;

public class QiuZuHeShu_1100 {

	/**
	 * �������m!/(k!(m-k)!)��Ҫ���д����fact()��ʵ����һ�����Ľ׳˹��ܣ����������е��ô˺����� 
	 * int fact(int n) {//��������ֵΪn�Ľ׳ˡ� } 
	 * 
	 * ���� 
	 * ��������������m,k��k<=m<=12�� 
	 * 
	 * ��� 
	 * ���һ������������Ϸ�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int k = scan.nextInt();
		int re = fact(m)/(fact(k)*fact(m-k));
		System.out.println(re);
	}
	public static int fact(int n) {
		if(n==0||n==1) {return 1;}
		else {return n*fact(n-1);}
	}
}
