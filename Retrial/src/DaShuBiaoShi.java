import java.util.Scanner;
public class DaShuBiaoShi{
	public static void main(String[] args){
		/**计算阶乘 ：输入一个正整数n，输出n!的值（其中n!=1*2*3*…*n）。
		 * n!可能很大，而计算机能表示的整数范围有限，需要使用高精度计算的方法。
		 * 使用一个数组A来表示一个大整数a，A[0]表示a的个位，A[1]表示a的十位，依次类推。
		 * 将a乘以一个整数k变为将数组A的每一个元素都乘以k，请注意处理相应的进位。
		 * 首先将a设为1，然后乘2，乘3，当乘到n时，即得到了n!的值。
		 */
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		//"jin"表示需要进多少位,"chengji"表示每一位与i的乘积
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
				for(j=i;j>=0;j--){
					System.out.print(arr[j]);
				}
				break;
			}
		}
	}
}
