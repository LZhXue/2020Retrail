import java.util.Scanner;

public class A_1212 {
	/*
	 * ��Ŀ����
	 * һ���˵�վ��N���ź����ʵĿӣ���������һ��ֱ���ϡ���������������з�������ʣ���ᷢ����ը�����ǣ���ĳЩ���п��ܲ��ź����ʡ�
	 * ���ڣ�������㣺���ڸ�����N���󲻷�����ը�ķ��ú����ʵķ���������
	 * 
	 * ���� 
	 * �����ļ�ֻ�ж��У�ÿ�ж�Ӧһ��������N����������
	 * 
	 * ��� 
	 * ����ļ��ж��У�ÿ��ֻ��һ������������ʾ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(searchSolution(n,3));
		}
	}

	public static int searchSolution(int n, int m) {
		int f[] = new int[n+1];
		f[0] = 1;
		for (int i = 1; i <= n; i++) {

			if (i < m)//��i���ӵ�ֻ�зŻ��߲���2�����
				f[i] = 2 * f[i - 1];
			if (i == m)////��i���ӵ�ֻ�зŻ��߲���2�����,��ȥ��1��ǰm�ӵ����ŵ��������Ϊǰ�涼���ˣ������ֻ�ܿգ�ֻ��һ������
				f[i] = 2 * f[i - 1] - 1;
			if (i > m)/*�����������ǰ i-1 ����������ը���� i ���ɷſɲ��ţ�f[i-1]*2
						�����������֪���ϵ�Ҫ�󣬼��� i-m+1 ... i �������ˣ�ר��� m ��������Ҫ�󣩣����� i-m ... i-1 �Ƿ���Ҫ���
						���Ե��� i-m ��û�зţ��� i-m+1 ... i �����˵�������Ƕ����ģ���ȥ�ⲿ�֣�f[i-m-1]������*/
				f[i] = 2 * f[i - 1] - f[i - m - 1];
		}
		return f[n];
	}
}