import java.util.Scanner;

public class A_1243 {
	/*
	 * 输入 
	 * 输入数据有多组，每组的第一行是两个整数m和n，表示应聘MM的总共的行列数，然后是m行整数，每行有n个，m和n的定义见题目的描述。
	 * 
	 * 输出 
	 * 对于每组输入数据，输出三个整数x,y和s，分别表示选中的MM的行号、列号和分数。
	 * note:行号和列号从一开始，如果有多个MM的分数绝对值一样，那么输出排在最前面的一个（即行号最小的那个，如果行号相同则取列号最小的那个）。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int arr[][] = new int[m][n];
			int max = Integer.MIN_VALUE;
			int indexi = 0;
			int indexj = 0;
			for(int i = 0;i<m;i++) {
				for(int j = 0;j<n;j++) {
					int temp = scan.nextInt();
					arr[i][j] = temp;
					if(temp<0) {
						temp = temp*(-1);
					}
					if(max<temp) {
						max = temp;
						indexi = i;
						indexj = j;
					}
				}
			}
			
			System.out.println((indexi+1)+" "+(indexj+1)+" "+arr[indexi][indexj]);
		}
	}

}
