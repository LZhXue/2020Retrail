import java.util.ArrayList;
import java.util.Scanner;

public class A_1214 {
	/*
	 * 题目描述 
	 * 挂盐水的时候，如果滴起来有规律，先是滴一滴，停一下；然后滴二滴，停一下；再滴三滴，停一下...，
	 * 现在有一个问题：这瓶盐水一共有VUL毫升，每一滴是D毫升，每一滴的速度是一秒（假设最后一滴不到D毫升，则花费的时间也算一秒），停一下的时间也是一秒这瓶水什么时候能挂完呢？
	 * 
	 * 输入 
	 * 输入数据占一行,由VUL和D组成,其中0< D< VUL< 5000。
	 * 
	 * 输出 
	 * 请输出挂完盐水需要的时间。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double vul = scan.nextDouble();
		double d = scan.nextDouble();
		int num = (int) Math.ceil(vul/d);//上取整，算出一共有多少滴，故滴下一共需num秒
		int sum = 0;
		ArrayList<Integer> al = new ArrayList();
		int i = 1;
		int index = 0;
		while(sum<num) {//计算几次才能滴完
			al.add(i);
			i++;
			sum+=al.get(index);
			index++;
		}
		System.out.println(num+al.size()-1);//-1因为最后一滴后的一秒不用算
	}

}
