import java.util.Scanner;

public class A_1150 {
	/*
	 * ��Ŀ���� С������ʦ��С������һ����Ŀ������һƪ���³����˶��ٸ����֣����������ɡ�
	 * 
	 * ���� ����һ���ַ������ɿո�Ӣ����ĸ��������ɣ��Իس�����������С��1000��
	 * 
	 * ��� �����������(���������ַ�����Ŷ)��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, flag = 1;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				if (flag == 1)
					sum++;
				if (arr[i] != '0')
					flag = 0;
			} else
				flag = 1;
		}
		System.out.println(sum);
	}

}
