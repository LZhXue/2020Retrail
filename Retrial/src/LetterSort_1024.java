import java.util.Scanner;

public class LetterSort_1024 {
	/*
	 * ��Ŀ���� 
	 * ����һ��Ӣ����ĸ�������Ǵ�д��Ҳ������Сд�����������ĸ����ĸ���е���ţ���a���͡�A�������Ϊ1���� 
	 * 
	 * ���� 
	 * ����ֻ��һ��Ӣ����ĸ�� 
	 * 
	 * ���
	 * ���һ����������ʾ����ĸ����ĸ�����ţ��������ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char ch = str.toUpperCase().charAt(0);
		int xx = (int) ch;
		System.out.println(xx-64);
		
	}

}
