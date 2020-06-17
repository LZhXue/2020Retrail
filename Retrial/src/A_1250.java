import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_1250 {
	/*
	 * ��Ŀ���� 
	 * Little Jing�кܶ��ˣ���֪ÿ����˵ĳ���(������10000)��������Ҫ�ѱ�˲��ڵ��ϣ���ͬ���ȵı��Ҫ����һ��(һ����������һ��������)��LittleJing��֪�������ϲ��˶��ٸ��ˣ����ܰ������
	 * 
	 * ���� 
	 * ��������һ������N,��ʾ��N�����ʵ���� ÿ��ʵ���������У���һ��һ��������n(n<=1000)����ʾ��˵�������
	 * �ڶ�����n����������ʾn����˵ĳ��ȡ�
	 * 
	 * ��� 
	 * ÿ��ʵ�����һ�У���������������󳤶���ߵ��Ǹ����������ı�˵����������ϲ��˶��ٸ���,�м���һ���ո����������Ŀ��֤��Ψһ�⣩
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
