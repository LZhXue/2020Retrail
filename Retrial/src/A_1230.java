import java.util.Scanner;

public class A_1230 {
	/*
	 * ��Ŀ���� ��ֱ����һƬ������ܻ�ͷ��ѡ������Ϊ�������룬���ǵ���ѡ��һ������󣬾Ͳ���ѡ�ڶ��Ρ� ���� surfacedust
	 * ׼������һ������ʿ�����ʦ�ܾ���ǰ���������⣬surfacedust��һ����׼��������������ǲ����㹻�á����һ������ﵽ�����׼�֣�
	 * ����Ϊ������Ҫѡ����Ǹ���
	 * 
	 * ���� ÿ��ʵ�����У���һ����surfacedust�ı�׼�֣��ڶ���Ϊһ������N��N < 100000������������N�����������α�ʾ��ÿ������ķ�����
	 * 
	 * ��� surfacedust��Ҫ�߶�ò����ҵ������е��Ǹ����룬������Ҳ������Ǿ������NONE�������������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double standard = scan.nextDouble();
			int n = scan.nextInt();
			double arr[] = new double[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextDouble();
			}
			for (int i = 0; i < n; i++) {
				if (arr[i] >= standard) {
						sum = i + 1;
						break;
				}
			}
			if (arr[n - 1] < standard && sum == 0) {
				System.out.println("NONE");
			} else {
				System.out.println(sum);
			}
		}
	}

}
