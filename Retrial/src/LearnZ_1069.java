import java.util.Scanner;

public class LearnZ_1069 {
	/*
	 * ZͬѧΪ��ʵ�����ȥ�������ε����룬�����Ժ�ÿ��ֻ����1Ԫ��ÿ��kԪ�Ϳ����ٵõ�1Ԫ��һ��ʼZͬѧ��MԪ���������Լ�ֶ����졣 
	 * 
	 * ���� 
	 * ����2������M,k��(2 <= k <= M <= 1000)�� 
	 * 
	 * ��� 
	 * ���һ����������ʾMԪ�������ѵ�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int k = scan.nextInt();
		int day = 0;
		int hua = 0;
		while(m!=0) {
			day++;
			m--;
			hua++;
			if(hua==k) {
				m++;
				hua = 0;
			}
		}
		System.out.println(day);
	}

}
