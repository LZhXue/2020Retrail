import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A_1149 {
	/*
	 * ��Ŀ����
	 * ��1��2��3��4��5��6��7��8��9�����������λ����ÿ����ֻ����һ�Σ�,�ڶ������ǵ�һ������2�������������ǵ�һ������3������������λ�����Ƕ��٣�
	 * �𰸿����кܶ��飬�밴��һ����������˳�����ÿ���������λ����
	 * 
	 * ���� ��
	 * 
	 * ��� �������������������λ����ϣ�����һ����������˳�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Set<Character> judge = new HashSet();
		for (int i = 191; i <= 329; i++) {
			if (isUnique(i)) {
				sb.append(String.valueOf(i));
				for (int j = i * 2; j < 655; j++) {
					if (isUnique(j)) {
						sb.append(String.valueOf(j));
						for (int k = i * 3; k < 982; k++) {
							if (isUnique(k)) {
								sb.append(String.valueOf(k));
								for (int m = 0; m < sb.length(); m++) {
									judge.add(sb.toString().toCharArray()[m]);
								}
								if (judge.size() == 9&&j==i*2&&k==i*3) {
									System.out.println(i + " " + j + " " + k);
								}

								sb.delete(6, 9);
								judge.clear();
							} // endk-if
						} // endk
						sb.delete(3, 6);
					} // endj-if
				} // endj
				sb.delete(0, 3);
			} // endi-if
		} // endi
	}

	public static boolean isUnique(int num) {
		String str = String.valueOf(num);
		char ch[] = str.toCharArray();// ��iתΪ�ַ�����
		Set set = new HashSet();
		for (int j = 0; j < 3; j++) {
			set.add(ch[j]);// ��i��ÿһ���ַ��ӵ�Set��
		}
		if (set.size() < 3) {
			return false;// �����ʮ��λ�����ظ���
		} else if (set.contains('0')) {
			return false;// �����ʮ��λ�������
		} else {
			return true;
		}
	}
}
