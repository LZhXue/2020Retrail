import java.util.Scanner;

public class ProblemMilestone {

	/*
	 * 题目描述 
	 * 某辆汽车有一个里程表，该里程表可以显示一个整数，为该车走过的公里数。然而这个里程表有个毛病：
	 * 它总是从3变到5，而跳过数字4，里程表所有位（个位、十位、百位等）上的数字都是如此。
	 * 例如，如果里程表显示339,汽车走过1公里之后，该里程表显示350。 
	 * 
	 * 输入
	 * 输入一个整数num，表示里程表显示的数值，1 < num < 1000，且一定不含整数4。 
	 * 
	 * 输出 
	 * 输出一个整数，为该汽车实际行驶的公里数。例如，如果该里程表显示55，则实际走过的公里数是40。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++){
	        if(i%10!=4&&i/10%10!=4&&i/100%10!=4){
	            sum++;
	        }
	    }
		System.out.println(sum);
	}

}
