import java.util.Scanner;

public class GetAverage_1097 {

	/*
	 * ��Ŀ����
	 * ����ĳλͬѧ���ſεĳɼ������ƽ���ɼ�������ĳɼ���Ϊ�弶�Ƴɼ����弶�Ƴɼ�ת��Ϊ�ٷ�֮�ɼ��Ĺ������£�
	 * 'A'ת��Ϊ�ٷ�֮�ɼ�Ϊ95�֣�'B'��Ӧ85�֣�C��Ӧ75�֣�'D'��Ӧ65�֣�'E'��Ӧ40�֡� �����ƽ���ɼ�Ϊһ��ʵ��������1λС����
	 * getScore(char g) { //�ѵȼ�gת���ɶ�Ӧ�ķ������������������ }
	 * 
	 * ����
	 * ����Ϊһ��ֻ����'A'~'E'����ĸ��ÿ����ĸ��ʾһ�ſεĳɼ���
	 * 
	 * ��� 
	 * ���ƽ���ɼ���Ϊһ��ʵ��������һλС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int len = str.length();
		double sum = 0;
		for(int i = 0;i<len;i++) {
			sum+=getScore(str.charAt(i));
		}
		System.out.printf("%.1f",sum/len);
	}

	public static int getScore(char g) {
		if(g=='A') {
			return 95;
		}else if(g=='B') {
			return 85;
		}else if(g=='C') {
			return 75;
		}else if(g=='D') {
			return 65;
		}else {
			return 40;
		}
	}
}
