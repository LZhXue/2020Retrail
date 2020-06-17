import java.util.Scanner;

public class A_1237 {
	/*
	 * 题目描述 
	 * 有5人坐在一起，当问第5个人多少岁,他说比第4个人大2岁，问第4个人多少岁,他说比第3个人大2岁，依此下去，问第一个人多少岁，他说他10岁，
	 * 最后求第5个人多少岁？如果所坐的不是5人而是n人，写出第n个人的年龄。
	 * 
	 * 
	 * 输入 
	 * N组实例,每组实例输入两个整数，n，m。第一个表示n个人，第二个表示最后一个被问的人的年龄。
	 * 
	 * 输出 输出第n个人的年龄，占一行
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1;i<=t;i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			System.out.println(m+(n-1)*2);
		}
	}

}
