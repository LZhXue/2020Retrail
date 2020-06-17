import java.util.Scanner;

public class FindJueDuiMax_1038 {
	/*
	 * 题目描述 
	 * 输入3个整数，输出绝对值最大的那个数。 
	 * 
	 * 输入 
	 * 输入包含3个int范围内的整数，用空格隔开。
	 * 
	 * 输出
	 * 输出三个数中绝对值最大的数，单独占一行。若绝对值最大的数不唯一，则输出最先出现的那个。
	 * 例如，若输入为1 -3 3，则输出为-3；若输入为1 3 -3则输出为3。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr1[] = {scan.nextInt(),scan.nextInt(),scan.nextInt()};
		int arr2[] = {0,0,0};
		for(int i =0;i<3;i++) {
			if(arr1[i]<0) {
				arr2[i] = (-1)*arr1[i];
			}else {
				arr2[i] = arr1[i];
			}
		}
		int index = 0;
		int max = arr2[0];
		for(int j=0;j<3;j++) {
			if(max<arr2[j]) {
				max = arr2[j];
				index = j;
			}
		}
		System.out.println(arr1[index]);
 	}

}
