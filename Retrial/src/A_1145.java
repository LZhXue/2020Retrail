import java.util.Scanner;

public class A_1145 {

	/*
	 * ��Ŀ���� ĳ��������һ����̱�����̱������ʾһ��������Ϊ�ó��߹��Ĺ�������Ȼ�������̱��и�ë���������Ǵ�3�䵽5������������4����̱�����λ����λ��
	 * ʮλ����λ�ȣ��ϵ����ֶ�����ˡ����磬�����̱���ʾ15339,�����߹�1����֮�󣬸���̱���ʾ15350��
	 * 
	 * ���� ����һ������num����ʾ��̱���ʾ����ֵ�����Ȳ�����9λ����һ����������4��
	 * 
	 * ��� ���һ����������ʾʵ����ʻ����̡�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		int sum = 0;
//		for(int i = 1;i<=n;i++) {
//			String str = String.valueOf(i);
//			if(str.contains("4")) {
//				continue;
//			}else {
//				sum++;
//			}
//		}
//		System.out.println(sum);
		// �˷���ʱ�䳬��
		// ת��Ϊ9����,����Ϊ������ۼ�
		char nn[] = String.valueOf(n).toCharArray();
		int a = 0;
		for (int i = 0; i<nn.length; i++) {
			a *= 9;
			if (nn[i] - '0' > 4) {
				a -= 1;
			}
			a += nn[i] - '0';
		}
		System.out.println(a);
	}
}
