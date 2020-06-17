import java.util.Scanner;

public class A_1199 {

	/*
	 * 判题系统需要把解题程序产生的输出文件和正确的输出文件进行比较，如果两个文件完全相同，则判题系统返回“Accepted”，否则，如果两个文件除了空白符(
	 * 空格' ', 制表符'\t', 或 回车符'\n')之外其余内容都相同，则判题系统返回“Presentation
	 * Error”，否则判题系统返回“Wrong Answer”。
	 * 给定两个文件，一个代表正确输出，一个代表用户的解题程序的输出，你的任务是计算判题系统应该返回什么信息。
	 * 
	 * 输入
	 * 输入包含多组测试实例。第一行输入一个整数T表示测试实例的个数。然后是T组输入。每组输入有两部分：一个代表正确输出，一个代表用户的解题程序的输出。都以“
	 * START”开始，以“END”结束，在“START”和“END”之间的是需要判断的数据部分。
	 * 
	 * 输出 对于每一个测试实例，有一行输出，输出判题系统应该返回的结果：Accepted、Presentation Error或Wrong Answer。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String startsd = scan.nextLine();
			String standard = null;
			while(startsd.equals("")) {
				startsd = scan.nextLine();
			}//读到空行继续读下一行
			if(startsd.equals("START")) {
				StringBuilder sbsd = new StringBuilder();
				String nextsd = scan.nextLine();
				while(nextsd.equals("")) {
					nextsd = scan.nextLine();
				}//读到空行继续读下一行
				while(!nextsd.equals("END")) {
					sbsd.append(nextsd+"$");
					nextsd = scan.nextLine();
					while(nextsd.equals("")) {
						nextsd = scan.nextLine();
					}//读到空行继续读下一行
				}
				standard = sbsd.toString();
			}//取到standard
			
			//把standard去掉空行等
			StringBuilder sbsdsplit = new StringBuilder();
			sbsdsplit.append(standard);
			for(int m = 0;m<sbsdsplit.length();m++) {
				if(sbsdsplit.charAt(m)==' '||sbsdsplit.charAt(m)=='\n'||sbsdsplit.charAt(m)=='\t') {
					sbsdsplit.deleteCharAt(m);
				}
			}
			String standardSplit = sbsdsplit.toString();
			
			String startanser = scan.nextLine();
			while(startanser.equals("")) {
				startanser = scan.nextLine();
			}//读到空行继续读下一行
			if(startanser.equals("START")) {
				StringBuilder sbanser = new StringBuilder();
				String nextanser = scan.nextLine();
				while(nextanser.equals("")) {
					nextanser = scan.nextLine();
				}//读到空行继续读下一行
				while(!nextanser.equals("END")) {
					sbanser.append(nextanser+"$");
					nextanser = scan.nextLine();
				}
				String anser = sbanser.toString();
				for(int m = 0;m<sbanser.length();m++) {
					if(sbanser.charAt(m)==' '||sbanser.charAt(m)=='\n'||sbanser.charAt(m)=='\t') {
						sbanser.deleteCharAt(m);
					}
				}
				String anserSplit = sbanser.toString();
				if(standard.equals(anser)) {
					System.out.println("Accepted");
				}else if(standardSplit.equals(anserSplit)) {
					System.out.println("Presentation Error");
				}else {
					System.out.println("Wrong Answer");
				}
			}
		}
		
	}

}
