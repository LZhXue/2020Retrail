import java.util.Scanner;

public class A_1221 {
	/*
	 * ���Ƕ�֪��DNA�е���Ϣ�������ֻ�ѧ�����ɵ�������ʽ�洢�ģ������ʣ�a���������ʣ�G��������ण�C����������ण�T����
	 * DNA����˴���ԣ�A��T��C��G ���γɳ�Ϊ����Եĵ�λ��
	 * 
	 * ���ڣ����Ǹ���DNA���е�һ���֣����ܸ�������һ������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i =0;i<n;i++) {
			String str = scan.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int j = 0;j<str.length();j++) {
				if(str.charAt(j)=='A') {
					sb.append('T');
				}else if(str.charAt(j)=='T') {
					sb.append('A');
				}else if(str.charAt(j)=='C') {
					sb.append('G');
				}else if(str.charAt(j)=='G') {
					sb.append('C');
				}
			}
			System.out.println(sb.toString());
		}
	}

}
