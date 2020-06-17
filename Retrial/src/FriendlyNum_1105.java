import java.util.Scanner;

public class FriendlyNum_1105 {

	/*
	 * ��������������m��n��˳�����m��n֮��������Ѻ����ԡ�
	 * �����������������������֮�ͣ�����1���������������ڶԷ����ͳ���������Ѻõġ����磺1184��1210���Ѻ����ԣ���Ϊ
	 * 1184������֮��Ϊ1+2+4+8+16+32+37+74+148+296+592=1210
	 * 1210������֮��Ϊ1+2+5+10+11+22+55+110+121+242+605=1184 
	 * int facsum (int n) { //����n������������֮��sum������������sum } 
	 * 
	 * ���� 
	 * ��������������m��n��1<m<=n<=10000�� 
	 * 
	 * ���
	 * ���m��n֮��������Ѻ����ԡ�
	 * �����ÿ���Ѻ�����ʱ��Ҫ��С����ǰ�������ں󣬲�ȥ���ظ������ԡ����磬220��284��һ���Ѻ�������284��220Ҳ��һ���Ѻ�����
	 * ��ʱֻ�����220��284����Ѻ�����ÿ���Ѻ�����ռһ�У�����֮���ÿո������ ���m��n֮��û���Ѻ����ԣ��������No answer����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
//������д�����س�ʱ
//		int flag = 0;
//		for(int i = m;i<=n;i++) {
//			for(int j = i+1;j<=n;j++) {
//				if((facsum(i)==j)&&(facsum(j)==i)) {
//					flag = 1;
//					System.out.println(i+" "+j);
//				}
//			}
//		}
//		if(flag==0) {
//			System.out.println("No answer");
//		}
		int j=0;
		for(int i=m;i<=n;i++)
		{
			if(facsum(facsum(i))==i && facsum(i)>i && facsum(i)<=n)
			{
				System.out.println(i+" "+facsum(i));
				j++;
			}
		}
		if(j==0) System.out.println("No answer");

	}
	public static int facsum (int n) {
		int sum = 0;
		for(int i = 2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				sum = sum+i+n/i;
			}
		}
		return sum+1;
	}
}
