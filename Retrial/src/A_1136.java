import java.util.Scanner;

public class A_1136 {
	/*
	 * ��Ŀ���� ����һ��ֻ������СдӢ����ĸ�Ϳո�ľ��ӣ���ÿ�����ʵĵ�һ����ĸ�ĳɴ�д��ĸ��
	 * 
	 * ���� ����һ�����Ȳ�����100��Ӣ�ľ��ӡ�
	 * 
	 * ��� ���������Ҫ���д���Ӣ�ľ��ӡ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//a97,A65
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		for(int i =1;i<str.length();i++) {
			if(arr[i-1]==' '&&Character.isLowerCase(arr[i])) {
				int ch = arr[i]-32;
				arr[i] = (char)ch;
			}
		}
		if(Character.isLowerCase(arr[0])) {
			int ch = arr[0]-32;
			arr[0] = (char)ch;
		}
		System.out.println(String.valueOf(arr));
	}

}
