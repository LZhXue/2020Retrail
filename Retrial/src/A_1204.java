import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_1204 {
	/*
	 * ��Ŀ���� һ��������һ�������������ͬ���ֺ͸������ַ������������ء�����һ�����߰����������������ܳ����˱˴���ص�����������һ���ֶΣ��Զ��ؽ����޳���
	 * 
	 * ���� ��ʵ�����ԡ�ÿ�����ݰ���һ��n(n<1000)����n��int��Χ�ڵ��������� ��nΪ0����ʾ������
	 * 
	 * ��� ����С�����˳����������������û�з�������������None��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			ArrayList<Integer> arrl = new ArrayList<Integer>();// ��ŷ������
			int input[] = new int[n];// �������е�����
			for (int i = 0; i < n; i++) {
				input[i] = scan.nextInt();
			}
			for (int i = 0; i < n; i++) {
				char chArrI[] = String.valueOf(input[i]).toCharArray();// input[i]תΪ�ַ����飬Ȼ�����������תΪ����
				Arrays.parallelSort(chArrI);
				String stri = String.valueOf(chArrI);
				boolean flag = true;
				for (int j = 0; j < n; j++) {
					if (i != j) {
						char chArrJ[] = String.valueOf(input[j]).toCharArray();
						Arrays.parallelSort(chArrJ);
						String strj = String.valueOf(chArrJ);
						if (stri.equals(strj)) {
							flag = false;
							break;//�ҵ���һ�������������Ĳ�����Ѱ��
						}
					}
				} // end-j
				if (flag) {//jѭ������Ҳû���ҵ��������˵��û�У��ӵ�ArrayList��
					arrl.add(input[i]);

				}
			} // end-i
			Collections.sort(arrl);// ���һ��ArrayList�ڲ�����������
			if (arrl.size() == 0) {
				System.out.println("None");
				n = scan.nextInt();//��Ҫ������һ������
				continue;
			}
			for (int m = 0; m < arrl.size(); m++) {
				System.out.print(arrl.get(m) + " ");
			}
			System.out.println();
			n = scan.nextInt();
		} // end-while
	}
}
