import java.util.Scanner;

public class A_1137 {
	/*
	 * ��Ŀ���� 
	 * ����������ַ������������е�ASCII��ֵ�����ĸ���ڸ���ĸ��������ַ�����(max)���� 
	 * 
	 * ����
	 * ����һ�г��Ȳ�����200���ַ�����ɣ��ַ������ɴ�Сд��ĸ���ɡ� 
	 * 
	 * ���
	 * ����Ľ���ǲ����ַ�����(max)����Ľ����������ڶ��������ĸ������ÿһ�������ĸ���涼����"(max)"��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		int max = -1;
		int len = str.length();
		for(int i = 0;i<len;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<len;i++) {
			sb.append(arr[i]);
			if(arr[i]==max) {
				sb.append("(max)");
			}
		}
		System.out.println(sb.toString());
	}

}
