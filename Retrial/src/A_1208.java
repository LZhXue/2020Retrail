import java.util.Scanner;

public class A_1208 {
	/*
	 * ��Ŀ���� 
	 * ��˵�ɾ���MCA���Ŷ���,������һ�����յ��糿������һ�δ��ģ�ĳ�ͻ.����������ӵ�,��������,��Ү��-Pacision������ɾ���Ȼ������������ƺƵ�����MCAɽɱ��,����ʱ��פ����MCA����ǰ�ߵ��Ǿþ�ɳ�����Ͻ��͸�.
	 * �͸��֪�����Ϣ,�����ټ����¾�Ӣ,ǰ������ɾ�.����֪�ɾ�ǰ���ٶ� U ��/�� ,�͸� �ٶ� V �� /�� ,����һ��ʼ���S��,ս�ؼ��ߴ������տ�ʼ���������̿�ʼ�� W
	 * ��/����ٶ���ͣ�������������֮������һʱ��ı���,��һ����һ��,���̷���ǰ����һ��.��,����������֮ʱ,ս�ؼ����ܹ��ߵ�·��.
	 * 
	 * ���� ��������һ��t,��ʾ��t�����ݣ�����t�У� ÿ�����ĸ�ʵ�� u, v, w, s�ֱ��ʾ�ɾ��ٶ�,�͸��ٶ�,�����ٶ�,�Լ���ʼ�ľ���.
	 * 
	 * ��� ���һ��ʵ����ʾ�ܵ�·��.��ȷ��С�����3λ.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0;i<t;i++) {
			double u = scan.nextDouble();
			double v = scan.nextDouble();
			double w = scan.nextDouble();
			double s = scan.nextDouble();
			double time = s/(u+v);
			double totalDistance = time*w;
			System.out.printf("%.3f\n",totalDistance);
		}

	}

}
