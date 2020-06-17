import java.util.Arrays;
import java.util.Scanner;

public class SortThreeNumber_1022 {
//键盘输入三个整数x,y和z，按从大到小的顺序输出它们的值。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x[] = {scan.nextInt(),scan.nextInt(),scan.nextInt()};
		Arrays.sort(x);
		System.out.println(x[2]+" "+x[1]+" "+x[0]);
		
 	}

}
