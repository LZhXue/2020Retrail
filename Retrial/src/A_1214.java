import java.util.ArrayList;
import java.util.Scanner;

public class A_1214 {
	/*
	 * ��Ŀ���� 
	 * ����ˮ��ʱ������������й��ɣ����ǵ�һ�Σ�ͣһ�£�Ȼ��ζ��Σ�ͣһ�£��ٵ����Σ�ͣһ��...��
	 * ������һ�����⣺��ƿ��ˮһ����VUL������ÿһ����D������ÿһ�ε��ٶ���һ�루�������һ�β���D�������򻨷ѵ�ʱ��Ҳ��һ�룩��ͣһ�µ�ʱ��Ҳ��һ����ƿˮʲôʱ���ܹ����أ�
	 * 
	 * ���� 
	 * ��������ռһ��,��VUL��D���,����0< D< VUL< 5000��
	 * 
	 * ��� 
	 * �����������ˮ��Ҫ��ʱ�䡣
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double vul = scan.nextDouble();
		double d = scan.nextDouble();
		int num = (int) Math.ceil(vul/d);//��ȡ�������һ���ж��ٵΣ��ʵ���һ����num��
		int sum = 0;
		ArrayList<Integer> al = new ArrayList();
		int i = 1;
		int index = 0;
		while(sum<num) {//���㼸�β��ܵ���
			al.add(i);
			i++;
			sum+=al.get(index);
			index++;
		}
		System.out.println(num+al.size()-1);//-1��Ϊ���һ�κ��һ�벻����
	}

}
