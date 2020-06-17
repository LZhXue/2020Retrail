import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_1154 {
	/*
	 * ��Ŀ���� 
	 * ĳУ�����ⳤ��ΪL ����·����һ������ÿ�������ڵ���֮��ļ������1 �ס����ǿ��԰���·����һ�����ᣬ��·��һ��������0 ��λ�ã���һ����L
	 * ��λ�ã������ϵ�ÿ�������㣬��0��1��2��������L��������һ������
	 * ������·����һЩ����Ҫ��������������Щ�����������������ϵ���ʼ�����ֹ���ʾ����֪��һ�������ʼ�����ֹ������궼������������֮��������غϵĲ��֡�
	 * ����Ҫ����Щ�����е�������������˵㴦�������������ߡ���������Ǽ��㽫��Щ�������ߺ���·�ϻ��ж��ٿ�����
	 * 
	 * ���� 
	 * �����һ����һ������N����ʾ��N��������ݡ�
	 * ÿ��������ݵĵ�һ������������L��1 <= L <= 10000���� M��1 <= M <= 100����L ������·�ĳ��ȣ�M �����������Ŀ��L ��M֮����һ���ո������
	 * ��������M ��ÿ�а���������ͬ����������һ���ո��������ʾһ���������ʼ�����ֹ������ꡣ
	 * 
	 * ��� 
	 * �������N�У�ÿ��ֻ����һ����������ʾ��·��ʣ���������Ŀ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i = 0;i<N;i++) {
			int L = scan.nextInt();//����L
			int M = scan.nextInt();//������M
			Set setL = new HashSet();
			for(int l = 0;l<=L;l++) {
				setL.add(l);
			}
			for(int j = 0;j<M;j++) {
				int start = scan.nextInt();
				int end = scan.nextInt();
				for(int k = start;k<=end;k++) {
					if(setL.contains(k)) {
						setL.remove(k);
					}
				}
			}
			System.out.println(setL.size());
		}
	}

}
