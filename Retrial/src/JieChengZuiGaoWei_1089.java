import java.util.Scanner;

public class JieChengZuiGaoWei_1089 {

	/*
	 * 题目描述 
	 * 输入一个正整数n。输出n!的最高位上的数字。 
	 * 
	 * 输入 
	 * 输入一个正整数n（n不超过1000）。 
	 * 
	 * 输出 
	 * 输出n!的最高位上的数字。
	 * 
	 * 知识点：超出表示范围的大数表示
	 * DaShuBiaoShi.java
	 * 
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int jin=0,chengji,j,i;
		//当n足够大时，int和long并不能储存下n的阶乘，
		//故用数组将阶乘按个十百千的顺序将每一个位数储存进数组arr中
		int[] arr = new int[10000];
		//为数组附初值10000……
		for(i=1;i<arr.length;i++) arr[i]=0;
		arr[0]=1;
		//求阶乘
		for(i=2;i<=n;i++){ //已经为arr[0]赋值为1，所以i从2开始递增
			for(j=0;j<arr.length;j++){ //不知道求阶乘时会用到几位数，故循环arr.length次
				chengji=arr[j]*i;  //求每一位的乘积
				if(chengji+jin<10){ //如果乘积+前一位进的数<10,则不用满十进一
					arr[j]=arr[j]*i+jin;
					jin=0;  //需要将jin清零，否则将使下一位数受到不属于它的jin的影响
				}
				else{ //满十进一
					arr[j]=(chengji+jin)%10;//本位保留余数
					jin=(chengji+jin)/10; //下一位需加jin
				}
			}
		}
		//以arr[arr.length-1]到arr[0]方向进行，
		//当遇到第一个不为0的数时开始输出数组元素
		//输出结束用break;结束外层循环
		for(i=arr.length-1;i>=0;i--){
			if(arr[i]!=0){
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
