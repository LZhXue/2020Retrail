import java.util.Scanner;

public class JiaoGuCaiXiang_1099 {
	/*
	 * ��Ŀ���� 
	 * �κ�һ����Ȼ���������ż�����ͳ���2��������������ͳ���3�ټ�1����󣬾������ɴε����õ�1��
	 * Ҳ����˵�������������������ϳ���2�Ժ������1��
	 * ���ڸ���һ����Ȼ��n�������ת��Ϊ1����Ҫ�Ĳ����� 
	 * 
	 * ���� 
	 * ���������ж��飬ÿ���������һ����Ȼ��n���������ݱ�֤�������ݼ��м�������int��Χ�ڡ� 
	 * 
	 * ���
	 * ��ÿ�����룬��������ǹȲ�����1�Ĳ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			int step = 0;
			while(n!=1) {
				if(n%2==0) {
					n = n/2;
				}else {
					n = n*3+1;
				}
				step++;
			}
			System.out.println(step);
		}
	}

}
