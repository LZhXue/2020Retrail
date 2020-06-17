import java.util.Arrays;
import java.util.Scanner;

public class A_1273 {
	// 进程调度算法，使得平均等待时间最短
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tt = scan.nextInt();
		for(int t = 0;t<tt;t++) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = scan.nextInt();
			}
			//结论：Arrays.sort比parallelSort效率要高
			Arrays.sort(arr);
			//Arrays.parallelSort(arr);
			int start = 0;
			double sumWait = 0;
			for(int i = 0;i<n;i++) {
				sumWait +=start;
				start +=arr[i];
			}
			System.out.printf("%.3f\n",sumWait/n);
		}
	}

}
