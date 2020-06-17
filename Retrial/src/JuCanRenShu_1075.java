import java.util.Scanner;

public class JuCanRenShu_1075 {

	/*
	 * 题目描述 
	 * 马克思手稿中有这样一道趣味数学题：男人、女人和小孩总计n个人，在一家饭店里吃饭，共花了cost先令，每个男人各花3先令，每个女人各花2先令，
	 * 每个小孩各花1先令，请用穷举法编程计算男人、女人和小孩各有几个。 
	 * 
	 * 输入 
	 * 输入两个正整数，表示人数n和花费cost。 
	 * 
	 * 输出
	 * 若问题有解，则输出所有解，每行输出三个数据，代表男人、女人和小孩的人数，用空格分隔；若问题无解，则输出“No answer"。
	 */	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 int cost = scan.nextInt();
		 int flag = 0;
		 for(int i = 0;i<=n;i++) {
			 for(int j = 0;j<=n;j++) {
				 for(int k = 0;k<=n;k++) {
					 if((i+j+k==n)&&(3*i+2*j+k==cost)) {
						 flag = 1;
						 System.out.println(i+" "+j+" "+k);
					 }
				 }
			 }
		 }
		 if(flag==0) {
			 System.out.println("No answer");
		 }
	}

}
