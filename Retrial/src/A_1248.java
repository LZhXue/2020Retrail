import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class A_1248 {
	/*
	 * 题目描述
	 * 输入多个字符串，有些是对称的，有些是不对称的，请将那些对称的字符串按从小到大的顺序输出。字符串先以长度论大小，如果长度相同，再以ASCII码值为大小标准。
	 * 
	 * 输入 输入第一行是一个整数n(1<=n<=100)，接下来n行是n个字符串，每个字符串不大于200个字符。
	 * 
	 * 输出 输出对称的那些串，并且要求按从小到大的顺序输出，每个字符串占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		while (scan.hasNextLine()) {
			String temp = scan.nextLine();
			if(temp.length()==0) {
				break;
			}
			if (isSymmetric(temp)) {
				al.add(temp);
			}
		}
		al.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length() < o2.length()) {
					return -1;
				} else if (o1.length() > o2.length()) {
					return 1;
				} else {
					if (o1.compareTo(o2) > 0) {
						return 1;
					} else if (o1.compareTo(o2) < 0) {
						return -1;
					} else
						return 0;
				}

			}

		});
		for(String str : al) {
			System.out.println(str);
		}
//		int len = al.size();
//		for (int i = 0; i < len; i++) {
//			for (int j = len - 1; j > i; j--) {
//				if (al.get(i).length() > al.get(j).length()) {
//					String temp = al.get(i);
////                    al.re
////                    al.replace(al.get(j),temp);
////                    al.get(j) = temp;
//				}
//			}
//		}
	}

	public static boolean isSymmetric(String str) {
		int len = str.length();
		if(len==1) {
			return false;
		}
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
