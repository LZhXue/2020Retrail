import java.util.Scanner;

public class A_1128 {
	/*
	 * ��Ŀ���� 
	 * ��ĩ���Խ������������õ��˱���ѧ���ĳɼ����ܱ�
	 * ��m��n�����(���๲��m��ѧ������ѧ����n�ſγ�),ÿ����һ��ͬѧ��n�ſγ̳ɼ������д����
	 * ���㲢���ÿ�ſε�ƽ���֣��������2λС���� 
	 * 
	 * ���� 
	 * ��һ������������m��n����ʾ����������ͱ�ѧ�ڿγ���Ŀ��0<m<=1000��0<n<=10��
	 * �������ǳɼ�������m�У�ÿ��n��ʵ���� 
	 * 
	 * ��� 
	 * ���һ�У���n��ʵ����������λС������ʾÿ�ſε�ƽ���֣��ÿո������
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		double sub[] = new double[n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				double score = scan.nextDouble();
				sub[j] = sub[j]+score;
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.printf("%.2f"+" ",sub[i]/m);
		}
	}

}
