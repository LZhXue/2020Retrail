import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A_1148 {
	/*
	 * 题目描述 把1、2、3、4、5、6、7、8、9组合成3个3位数，要求每个数字仅使用一次，使每个3位数均为完全平方数。按从小到大的顺序输出这三个三位数。
	 * 
	 * 输入 无
	 * 
	 * 输出 按从小到大的顺序输出这三个三位数，由空格隔开。输出占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();// 所有个十百位不相同的平方数
		for (int i = 11; i < 32; i++) {
			int num = i * i;
			String str = String.valueOf(num);
			char ch[] = str.toCharArray();// 把i转为字符数组
			Set set = new HashSet();
			for (int j = 0; j < 3; j++) {
				set.add(ch[j]);// 把i的每一个字符加到Set中
			}
			if (set.size() < 3) {
				continue;// 如果个十百位中有重复的
			} else if (set.contains('0')) {
				continue;// 如果个十百位中有零的
			} else {
				al.add(num);
			}

		}
		int len = al.size();// 所有个十百位不相同平方数的数量
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
