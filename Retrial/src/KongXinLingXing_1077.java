import java.util.Scanner;

public class KongXinLingXing_1077 {

	/*
	 * ��Ŀ���� 
	 * ����һ������n����1<=n<=20��,���һ���������Σ�����ÿ������n��'*'��ɡ� 
	 * 
	 * ���� 
	 * �������һ������,n��1<=n<=20�� 
	 * 
	 * ���
	 * ���һ���������Σ�ÿ������n��'*'���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1-n;i<n;i++)
		{
			for(j=1-n;j<n;j++)
			{
				if(Math.abs(i)+Math.abs(j)==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		sc.close();
		
	}

}
