import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_1261 {
	/*
	 * �ڶ�ý�����ݴ����У�����ѹ���㷨��Ϊ��Ҫ��С������κ�����Լ�����һ������ѹ���㷨������ѽ�룬�����뵽һ���������ڶ�ý���������кܶ����ݶ����ظ��ģ�
	 * ���������������ͬ�����������ݳ��ֵĴ��������ݱ����ʾ�����磺1 1 1 2 3 3 3 3 3 ѹ����Ϊ3 1 1 2 5
	 * 3�����뷨��С�¾�ϣ�������ô���ʵ���ˡ����Ǵ�Ҷ�֪��С���������춼æ�ſ�B�ĸ�ϰ���У������Զ���������������ϣ����ΪACMer�������дһ�¡�
	 * 
	 * ���� ��������������ݣ���һ��һ������T����������������
	 * ÿ��������ʼһ����M<10^7��ʾ�������������ֵĸ�����������M������ʾҪ��ѹ�������֣�int��Χ����
	 * 
	 * ��� ÿ������������һ�����ֶԣ�������������һ������������֮����һ���ո������
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int m = 0; m < t; m++) {
			int n = scan.nextInt();
//Map�������
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
