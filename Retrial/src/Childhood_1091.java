import java.util.Scanner;

public class Childhood_1091 {
	/**
	 * ��Ŀ���� 
	 * RedraimentСʱ����·ϲ���ı�����������ϲ����¥����������ȥ�� �����׵���һ��ֻ������һ�׻���һ���ӱ������ס�
	 * ����һ����N��̨�ף��������һ��Redraiment�ӵ�0�׵���N�׹��м����߷��� 
	 * 
	 * ���� 
	 * ��������������ݡ� ÿ�����ݰ���һ��:N(1��N��40)��
	 * ������0���� 
	 * 
	 * ��� 
	 * ��Ӧÿ���������һ������� Ϊredraiment�����n�ײ�ͬ�߷���������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[40];
		arr[0] = 1;
		arr[1] = 2;
		for(int i = 2;i<40;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		while(true) {
			int a = Integer.valueOf(scan.nextLine());
			if(a==0) {
				break;
			}else {
				System.out.println(arr[a-1]);
			}
			
		}
		
	}

}
