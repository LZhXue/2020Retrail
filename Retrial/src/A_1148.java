import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A_1148 {
	/*
	 * ��Ŀ���� ��1��2��3��4��5��6��7��8��9��ϳ�3��3λ����Ҫ��ÿ�����ֽ�ʹ��һ�Σ�ʹÿ��3λ����Ϊ��ȫƽ����������С�����˳�������������λ����
	 * 
	 * ���� ��
	 * 
	 * ��� ����С�����˳�������������λ�����ɿո���������ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();// ���и�ʮ��λ����ͬ��ƽ����
		for (int i = 11; i < 32; i++) {
			int num = i * i;
			String str = String.valueOf(num);
			char ch[] = str.toCharArray();// ��iתΪ�ַ�����
			Set set = new HashSet();
			for (int j = 0; j < 3; j++) {
				set.add(ch[j]);// ��i��ÿһ���ַ��ӵ�Set��
			}
			if (set.size() < 3) {
				continue;// �����ʮ��λ�����ظ���
			} else if (set.contains('0')) {
				continue;// �����ʮ��λ�������
			} else {
				al.add(num);
			}

		}
		int len = al.size();// ���и�ʮ��λ����ͬƽ����������
		StringBuilder sb = new StringBuilder();
		Set<Character> result = new HashSet();
		int i=0,j=0,k=0;
		for(i = 0;i<len;i++) {
			sb.append(al.get(i));
			for(j = i+1;j<len;j++) {
				sb.append(al.get(j));
				for(k = j+1;k<len;k++) {
					sb.append(al.get(k));
					char re[] = sb.toString().toCharArray();
					for(int h = 0;h<re.length;h++) {
						result.add(re[h]);
					}
					if(result.size()==9) {
						System.out.println(al.get(i)+" "+al.get(j)+" "+al.get(k));
						return;
					}else {
						sb.delete(6, 9);
						result.clear();
					}
				}
				sb.delete(3, 6);
			}
			sb.delete(0, 3);
		}
	}
}
