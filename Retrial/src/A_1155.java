import java.util.Scanner;

public class A_1155 {

	/*
	 * 题目描述 
	 * 比较字符串大小，但比较的规则不同字典序规则。
	 * 字符比较新规则如下：A < a < B < b < ………… < Z < z。
	 * 
	 * 输入 
	 * 输入数据包含多个测试实例，每个测试实例占两行，每一行有一个字符串（只包含大小写字母， 长度小于10000）。
	 * 
	 * 输出 
	 * 如果第一个字bb符串小于第二个，输出YES，否则，输出NO。 注意：A < a < B < b < ………… < Z < z。
	 */
	public static void main(String[] args) {
		char flag[] = new char[52];//对比的标准
		for(int i = 0;i<52;i++) {
			if(i%2==0) {
				flag[i] = (char) ('A'+i/2);
			}else {
				flag[i] = (char) ('a'+i/2);
			}
//			System.out.print(flag[i]+" ");
		}
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String str1 = scan.nextLine();
			String str2 = scan.nextLine();
			int len1 = str1.length();
			int len2 = str2.length();
			int len = Math.min(len1, len2);
			for(int i = 0;i<len;i++) {
				int index1 = search(flag,str1.charAt(i));
				int index2 = search(flag,str2.charAt(i));
				if(index1 == index2) {
					if(i!=len-1) {
						continue;
					}else {
						if(len1>=len2) {
							System.out.println("NO");
							break;
						}else {
							System.out.println("YES");
							break;
						}
					}
				}else if(index1 <index2) {
					System.out.println("YES");
					break;
				}else {
					System.out.println("NO");
					break;
				}
			}
		}
		
	}
	
	public static int search(char arr[],char ch) {
		 for(int i = 0;i<arr.length;i++) {
			 if(arr[i]==ch) {
				 return i;
			 }
		 }
		 return -1;
	 }

}
