import java.util.ArrayList;
import java.util.Scanner;

public class A_1139 {

	/*
	 * ��Ŀ���� 
	 * ����n��n���ַ��������������̵��ַ�������������ͬ��������ֽ������һ����
	 * 
	 * ���� 
	 * ��һ����һ������n���������n�У�ÿ�а���һ������ĸ�����ֺͿո���ɵ��ַ��������Ȳ�����1000��
	 * 
	 * ��� 
	 * ������̵��ַ�������������ͬ��������ֽ������һ����
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList al = new ArrayList();
		int min = 1000;
		int index = -1;
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String str = scan.nextLine();
			if(min>str.length()) {
				min = str.length();
				index = i;
			}
			al.add(str);
		}
		System.out.println(al.get(index));
	}

}
