import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_1250 {
	/*
	 * 题目描述 
	 * Little Jing有很多标杆，已知每个标杆的长度(不超过10000)，现在她要把标杆插在地上，相同长度的标杆要接在一起(一个接在另外一个的上面)。LittleJing想知道最后地上插了多少根杆，你能帮帮她吗？
	 * 
	 * 输入 
	 * 首先输入一个整数N,表示有N组测试实例。 每组实例输入两行，第一行一个正整数n(n<=1000)，表示标杆的数量。
	 * 第二行是n个正整数表示n个标杆的长度。
	 * 
	 * 输出 
	 * 每组实例输出一行，包含两个数，最后长度最高的那根杆所包含的标杆的数量，地上插了多少根杆,中间用一个空格隔开。（题目保证有唯一解）
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0;i <n;i++) {
			int m = scan.nextInt();
			int arr[] = new int[m];
			for(int j = 0;j<m;j++) {
				arr[j] = scan.nextInt();
			}
			
			Map<Integer,Integer> mapMax=new HashMap<Integer,Integer>();
			
			for (int j = 0; j < arr.length; j++) {
				if(mapMax.containsKey(arr[j]))
				{
					int temp=mapMax.get(arr[j])+arr[j];
					mapMax.put(arr[j], temp);
							
				}
				else {
					mapMax.put(arr[j], arr[j]);
				}
			}
			int num=mapMax.size();
			int max=-1,index=-1;
			
			for(Map.Entry<Integer,Integer> entry : mapMax.entrySet()){
				Integer mapKey = entry.getKey();
				Integer mapValue = entry.getValue();
			    
			    if(mapValue>max) {
					max=mapValue;
					index=mapKey;
				}
			}
			System.out.println(max/index+" "+num);
		}
	}
}
