import java.util.Scanner;

public class A_1249 {
	/*
	 * ��Ŀ���� ��ĩ���Խ����ˣ�Ms.White�õ�һ���༶�ĳɼ��ᣬ���༶��n��ѧ������ѧ����m�ſγ̣�ÿ��ѧ��ÿ�ſεĳɼ���1��9֮���һ��������
	 * ���ĳ��ѧ����ĳһ�ſγ̵��˸ÿγ̵���߷֣���߷ֿ��Բ�Ψһ���������˵��ѧ���ڸÿγ��������ŵġ����һ��ѧ��������һ�ſγ��������ŵģ�Mr.White����Ϊ��ѧ���ǳɹ��ġ�Mr.White��֪�������İ����ж���ѧ���ǳɹ��ġ����ܰ������
	 * 
	 * ���� 
	 * �����һ������������n��m(1 <= n,m <= 100)��n��ѧ��������m�ǿγ�����������n�У�ÿ�а���m�����֣���ʾһ��ѧ����m�ſγ̵ĳɼ�������֮���ÿո������
	 * 
	 * ��� 
	 * ���һ����������ʾ�༶�гɹ�ѧ����������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();// ѧ������
		int m = scan.nextInt();// �γ���
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int standard[] = new int[m];
		for (int i = 0; i < m; i++) {
			int max = -1;
			for (int j = 0; j < n; j++) {
				if (max < arr[j][i]) {
					max = arr[j][i];
				}
			}
			standard[i] = max;
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == standard[j]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
