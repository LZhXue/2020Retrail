import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_1261 {
	/*
	 * 在多媒体数据处理中，数据压缩算法尤为重要。小媛上完课后就想自己发明一个数据压缩算法。她想呀想，终于想到一个方法。在多媒体数据中有很多数据都是重复的，
	 * 所以她想把连续相同的数据用数据出现的次数和数据本身表示。例如：1 1 1 2 3 3 3 3 3 压缩后及为3 1 1 2 5
	 * 3。有想法后小媛就希望把它用代码实现了。但是大家都知道小媛现在整天都忙着苦B的复习考研，连电脑都摸不到。所以她希望作为ACMer的你帮她写一下。
	 * 
	 * 输入 输入包含多组数据，第一行一个数字T代表输入样例数。
	 * 每组样例开始一个数M<10^7表示这组数据中数字的个数，接下来M个数表示要被压缩的数字（int范围）。
	 * 
	 * 输出 每组测试数据输出一行数字对，如上面描述的一样。两个数字之间用一个空格隔开。
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int m = 0; m < t; m++) {
			int n = scan.nextInt();
//Map是无序的
//			Map<Integer, Integer> mapSum = new HashMap<Integer, Integer>();
//			for (int i = 0; i < n; i++) {
//				int temp = scan.nextInt();
//				if (mapSum.containsKey(temp)) {
//					int value = mapSum.get(temp) + 1;
//					mapSum.put(temp, value);
//
//				} else {
//					mapSum.put(temp, 1);
//				}
//			}
//			mapSum.forEach((key, value) -> {
//				System.out.print(value + " " + key + " ");
//			});
			int nn[] = new int[n];
			
			for(int i = 0;i<n;i++) {
				nn[i] = scan.nextInt();
			}
			if(n==1) {
				System.out.print(1+" "+nn[0]);
			}else {
				int sum = 1;
				if(nn[n-1]==nn[n-2]) {
					for(int i = 0;i<n-1;i++) {
						
						if(nn[i]==nn[i+1]) {
							sum++;
						}else {
							System.out.print(sum+" "+nn[i]+" ");
							sum = 1;
						}
						if(i == n-2) {
							System.out.print(sum+" "+nn[i]+" ");
						}
					}
				}else {
					for(int i = 0;i<n-1;i++) {
						if(nn[i]==nn[i+1]) {
							sum++;
						}else {
							System.out.print(sum+" "+nn[i]+" ");
							sum = 1;
						}
					}
					System.out.print(1+" "+nn[n-1]);
				}
			}
			System.out.println();
		}
	}
}
