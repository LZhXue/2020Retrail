import java.util.Scanner;

public class A_1216 {
	/*
	 * �����Ǳ���ԭ��
	 * ��1�� ������ʵ��ַ�A��W��F��ת����I��
	 * ��2�� ������ʵ��ַ�C��M��S�ͷֱ�ת����L��o��v��
	 * ��3��������ʵ��ַ�D��P��G��B��ת����e��
	 * ��4�� ������ʵ��ַ�L��X�ͷֱ�ת����Y��u��
	 * ��5�� �����ַ������ֲ��䡣
	 * ��6�� ����END�ͽ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		while(!str.equals("END")) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch=='A'||ch=='W'||ch=='F') {
					sb.append('I');
					continue;
				}else if(ch=='C') {
					sb.append('L');
					continue;
				}else if(ch=='M') {
					sb.append('o');
					continue;
				}else if(ch=='S') {
					sb.append('v');
					continue;
				}else if(ch=='D'||ch=='P'||ch=='G'||ch=='B') {
					sb.append('e');
					continue;
				}else if(ch=='L') {
					sb.append('Y');
					continue;
				}else if(ch=='X') {
					sb.append('u');
					continue;
				}else{
					sb.append(ch);
				}
			}
			System.out.println(sb.toString());
			str = scan.nextLine();
		}
	}

}
