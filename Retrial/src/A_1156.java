import java.util.Scanner;

public class A_1156 {
	/*
	 * ��Ŀ���� 
	 * ����һ������Ӣ�ﵥ�ʣ�����Ӣ���﷨����ѵ�����ɸ������������£� 
	 * ��1�� �Ը�����ĸy��β����yΪi���ټ�es�� 
	 * ��2�� ��s, x, ch, sh��β�����es�� 
	 * ��3�� ��Ԫ��o��β�����es�� 
	 * ��4�� �����������s��
	 * 
	 * ���� 
	 * ����һ���ַ���������Сд��ĸ�����Ȳ�����20��
	 * 
	 * ��� 
	 * ������Ӧ�ĸ�����ʽ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		int len = sb.length();
		if(sb.charAt(len-1)=='y') {
			sb.replace(len-1, len, "ies");
		}else if(sb.charAt(len-1)=='o'||sb.charAt(len-1)=='s'||sb.charAt(len-1)=='x'||(sb.charAt(len-2)=='c'&&sb.charAt(len-1)=='h')||(sb.charAt(len-2)=='s'&&sb.charAt(len-1)=='h')) {
			sb.append("es");
		}else {
			sb.append("s");
		}
		System.out.println(sb.toString());
	}

}
