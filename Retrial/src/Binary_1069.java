import java.util.Scanner;

public class Binary_1069 {

	/*
	 * 题目描述 将一个二进制数，转换为对应的十进制数。
	 * 
	 * 输入 输入一个二进制数，以回车结束。该二进制数为正数，长度不超过31。
	 * 
	 * 输出 输出一个整数，为该二进制数对应的十进制数。
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		long sum = 0;
//		int oo = Integer.parseInt(str, 2); // 二进制转化为十进制
//		int oo = Integer.parseInt(str, 8); // 八进制转化为十进制
//		System.out.println(oo);
		//自己实现
		long arr[] = new long[32];
		arr[0] = 1;
		for(int i = 1;i<32;i++) {
			arr[i] = arr[i-1]*2;
		}
		//字符串逆转
		char[] chars = str.toCharArray();
        int end = chars.length - 1;
        int start = 0;
        while(end > start){
            char tmp = chars[end];
            chars[end] = chars[start];
            chars[start] = tmp;
            ++start;
            --end;
        }
        str = new String(chars);
        
		for(int j = str.length()-1;j>=0;j--) {
			if(str.charAt(j)=='1') {
				sum = sum+arr[j];
			}
		}
		System.out.println(sum);
				}

}
