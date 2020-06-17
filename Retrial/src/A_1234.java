import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_1234 {
	/*
	 * �ж���������ݣ�ÿ�����ݵĵ�һ������������n��m��n��ʾ��n����Ʒ��1��n��100��M��ʾ����ķ�ʽ(1��m��3)��������n��ÿһ����һ����Ʒ����Ϣ��
	 * ������ a.��Ʒ������name������ĸ��������ɣ����Ȳ�����100���Ҳ�Ϊ�գ� b.�۸� price��Ϊ�������� c.���� sale��Ϊ�Ǹ�������
	 * ��֤���ݶ���int��Χ�ڡ� Ȼ������Ĺؼ�����ȣ��Ͱ�name���ֵ������򣬱�֤û���ظ���name��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			scan.nextLine();
			ArrayList<Item> al = new ArrayList();
			int pri[] = new int[n];
			int sal[] = new int[n];
			for (int i = 0; i < n; i++) {
				String str[] = scan.nextLine().split(" +");
				String name = str[0];
				int price = Integer.valueOf(str[1]);
				int sale = Integer.valueOf(str[2]);
				al.add(new Item(name, price, sale));
				sal[i] = sale;
				pri[i] = price;
			}
			Collections.sort(al);
			if(m==1) {
				//���۸�ӵ͵�������
				Arrays.parallelSort(pri);
				for(int i = 0;i<n;i++) {
					for(int j = 0;j<al.size();j++) {
						if(pri[i]==al.get(j).price) {
							System.out.println(al.get(j).toString());
							al.remove(j);
						}
					}
				}
			}else if(m==2) {
				//���۸�Ӹߵ�������
				Arrays.parallelSort(pri);
				for(int i = n-1;i>=0;i--) {
					for(int j = 0;j<al.size();j++) {
						if(pri[i]==al.get(j).price) {
							System.out.println(al.get(j).toString());
							al.remove(j);
						}
					}
				}
			}else if(m==3) {
				//�������Ӹߵ�������
				Arrays.parallelSort(sal);
				for(int i = n-1;i>=0;i--) {
					for(int j = 0;j<al.size();j++) {
						if(sal[i]==al.get(j).sale) {
							System.out.println(al.get(j).toString());
							al.remove(j);
						}
					}
				}
			}
		}
	}

}

class Item implements Comparable<Item> {
	String name;
	int price;
	int sale;

	Item(String name, int price, int sale) {
		this.name = name;
		this.price = price;
		this.sale = sale;
	}
	
	@Override
	public String toString() {
		return name + " " + price + " " + sale;
	}

	@Override
	public int compareTo(Item o) {
		// �����ƴ�С��������
		if (this.name.compareTo(o.name) > 0) {
			return 1;
		} else if (this.name.compareTo(o.name) < 0) {
			return -1;
		}
		// ������
		return 0;
	}
}