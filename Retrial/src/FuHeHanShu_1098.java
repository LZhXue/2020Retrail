import java.util.Scanner;

public class FuHeHanShu_1098 {
//	�󸴺Ϻ���F(G(x))�����к���F(x)=|x-3|+|x+1|������G(x)=x^2-3x��Ҫ���д����funF()��funG()�ֱ���F(x)��G(x)�����๦����main()��ʵ�֡�
//			double funF(double x)
//			{
//			//��������F(x)��ֵ��
//			}
//			double funG(double x)
//			{
//			//��������G(x)��ֵ��
//			}
//			����
//			����һ��ʵ��x��
//			���
//			������Ϻ�����ֵ���������2λС�������ռһ�С�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		System.out.printf("%.2f",funF(funG(x)));

	}
	
	public static double funF(double x) {
		if(x<=-1) {
			return 2-2*x;
		}else if(x>-1&&x<=3) {
			return 4;
		}else {
			return 2*x-2;
		}
	}
	
	public static double funG(double x) {
		return x*x-3*x;
	}
}
