import java.util.Scanner;

public class Childhood_1091 {
	/**
	 * 题目描述 
	 * Redraiment小时候走路喜欢蹦蹦跳跳，他最喜欢在楼梯上跳来跳去。 但年幼的他一次只能走上一阶或者一下子蹦上两阶。
	 * 现在一共有N阶台阶，请你计算一下Redraiment从第0阶到第N阶共有几种走法。 
	 * 
	 * 输入 
	 * 输入包括多组数据。 每组数据包括一行:N(1≤N≤40)。
	 * 输入以0结束 
	 * 
	 * 输出 
	 * 对应每个输入包括一个输出。 为redraiment到达第n阶不同走法的数量。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[40];
		arr[0] = 1;
		arr[1] = 2;
		for(int i = 2;i<40;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		while(true) {
			int a = Integer.valueOf(scan.nextLine());
			if(a==0) {
				break;
			}else {
				System.out.println(arr[a-1]);
			}
			
		}
		
	}

}
