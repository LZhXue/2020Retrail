import java.util.Scanner;

public class ToUpper_1023 {

	/*
	 * ��Ŀ���� 
	 * ����һ����ĸ������Сд��ĸ�����Ϊ��д���������ԭ������� 
	 * 
	 * ���� 
	 * ����Ϊһ���ַ��� 
	 * 
	 * ��� 
	 * ����ĿҪ�����һ���ַ�������ռһ�С�
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String m = scan.nextLine();
//		Java��û���ṩ����ֱ�ӴӼ��̽���һ���ַ�,
//		���ǿ����ôӼ��̽���һ���ַ���ʵ�ֽ���һ���ַ��Ĺ��ܡ�
		char ch = m.toUpperCase().charAt(0);
		System.out.println(ch);
		
	}

}
