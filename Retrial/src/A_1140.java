import java.util.Scanner;

public class A_1140 {

	/*
	 * ��Ŀ���� ����һ��С��x���������С������nλ��ʲô��1 <= n <= 6��
	 * 
	 * ���� ��������һ��t,��ʾ��t�����ݣ�����t�У�
	 * ÿ������һ��С�����������ݱ�֤һ����a.b����ʽ,�ܳ��Ȳ�����100��Ϊ�˼򵥻����⣬û��ѭ��С�����������Ȼ���һ��n,��ʾС�����ڼ�λ��
	 * 
	 * ��� ���һ����������ʾС������nλ������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			String arr[] = str.split(" ");
			int index = Integer.valueOf(arr[1]);
			String str1[] = arr[0].split("\\.");// ע��Ҫ��ת��
			int cont = 0;
			if (str1[1].length() > 0) {
				char charr[] = str1[1].toCharArray();
				if (index > charr.length) {
					cont = 0;
				} else {
					cont = (int) (charr[index - 1] - 48);
				}
			}
			System.out.println(cont);
		}
//		int ch = '9';//0:48 9:57
//		System.out.println(ch);
	}

}
