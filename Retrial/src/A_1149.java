import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A_1149 {
	/*
	 * 题目描述
	 * 把1，2，3，4，5，6，7，8，9，组成三个三位数（每个数只能用一次）,第二个数是第一个数的2倍，第三个数是第一个数的3倍，这三个三位数各是多少？
	 * 答案可能有很多组，请按第一个数的升序顺序输出每组的三个三位数。
	 * 
	 * 输入 无
	 * 
	 * 输出 输出所有满足条件的三位数组合，按第一个数的升序顺序输出。
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
		char ch[] = str.toCharArray();// 把i转为字符数组
		Set set = new HashSet();
		for (int j = 0; j < 3; j++) {
			set.add(ch[j]);// 把i的每一个字符加到Set中
		}
		if (set.size() < 3) {
			return false;// 如果个十百位中有重复的
		} else if (set.contains('0')) {
			return false;// 如果个十百位中有零的
		} else {
			return true;
		}
	}
}
