import java.util.Scanner;

public class YinZiZhiHe_1104 {

	/*
	 * ��Ŀ���� 
	 * ����������n��2<=n<=1000�������㲢���n������������(����1������������)֮�͡�Ҫ�������һ��FacSum
	 * ()������һ��main()������FacSum ()�������㲢����n������������֮�ͣ����๦����main()������ʵ�֡� int FacSum(int n)
	 * { //����n������������(����1������������)֮��sum������������sum } 
	 * 
	 * ���� 
	 * ����������n��2<=n<=1000���� 
	 * 
	 * ���
	 * ���n������������(����������)֮�͡�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(FacSum(n));
	}
	public static int FacSum(int n)
	{
		int sum=0,i;
		for(i=1;i<n;i++)
		{
			if(n%i==0) sum=sum+i;
		}
		return(sum);
	}
}
