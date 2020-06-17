import java.util.Scanner;

public class A_1232 {
	/*
	 * 从学校到紫荆山公园共有n(1<=n<=20)站路，birdfly刚上车时车上有m个人，每到一站都有pi个人上车，qi个人下车
	 * 问这一路上公车上最多有多少人。(0<=m, pi ,qi <=50).
	 * 
	 * 输入 
	 * 输入有多组样例，每组样例第一行两个数n m，接下来n行每行两个数pi和qi。
	 * 
	 * 输出 
	 * 每组实例输出这一路上（包含上车站点和下车站点）公交车上最多的人数。每组实例输出占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int max = m;
			for(int i = 0;i<n;i++) {
				int shang = scan.nextInt();
				int xia = scan.nextInt();
				m = m+shang-xia;
				if(m>max) {
					max = m;
				}
			}
			System.out.println(max);
		}
	}

}
