import java.util.Scanner;

public class A_1133 {

	/*
	 * �Ӽ�������һ���ַ�������С��1000��ͳ�����е��ʵĸ������������Կո�ָ����ҿո��������Ƕ����
	 * 
	 * ���� ����ֻ��һ�о��ӡ����пո��Ӣ����ĸ����
	 * 
	 * ��� ���ʵĸ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] ch = new char[1010];
		int i, num, k = 0, sum = 0;
		num = s.length();
		ch = s.toCharArray();
		for (i = 0; i < num; i++) {
			if (Character.isUpperCase(ch[i]) || Character.isLowerCase(ch[i]))
				// �������ĸ
				k++;
			else // ���������ĸ
			{
				if (k != 0)// ֮ǰ�ǵ���
				{
					sum++;
					k = 0;
				}
			}
		}
		if (k != 0)
			sum++;
		System.out.println(sum);
		scan.close();
	}

}
