import java.util.Scanner;

public class RabbitColone_1055 {

	/*
	 * ����һ����Ȥ�Ĺŵ���ѧ���⣬�����������ѧ��Fibonacci�����һ�����⣺
	 * ��һ��С���ӣ��ӳ������3������ÿ���¶���һ�����ӡ�
	 * С���ӳ�����3���º�ÿ��������һ�����ӡ����˹��ɣ�����û��������������һ������һ�Ըճ�����С���ӣ��ʵ�n�����ж��ٶ����ӣ� ����
	 * 
	 * ����
	 * ����n��1<=n<=44���� 
	 * 
	 * ��� 
	 * �����n�����ж��ٶ����ӡ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nn[] = new int[45];
		nn[0] = 0;
		nn[1] = 1;
		nn[2] = 1;
		for(int i = 3;i<45;i++) {
			nn[i] = nn[i-1]+nn[i-2];
		}
		System.out.println(nn[n]);
	}

}
