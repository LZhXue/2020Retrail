import java.util.Arrays;
import java.util.Scanner;

public class ASC_1086 {
	/*
	 * ��Ŀ���� 
	 * ���������ַ��󣬰����ַ���ASCII���С�����˳������������ַ��� 
	 * 
	 * ���� 
	 * ���������ж��飬ÿ��ռһ�У��������ַ���ɣ�֮���޿ո� 
	 * 
	 * ���
	 * ����ÿ���������ݣ����һ�У��ַ��м���һ���ո�ֿ���
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String str = scan.nextLine();
			char c[] = new char[3];
			c = str.toCharArray();
			Arrays.parallelSort(c);
			System.out.println(c[0]+" "+c[1]+" "+c[2]);
		}
	}

}
