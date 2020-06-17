import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_1234 {
	/*
	 * 有多组测试数据，每组数据的第一行是两个整数n，m，n表示有n件物品，1≤n≤100。M表示排序的方式(1≤m≤3)接下来的n行每一行是一个物品的信息，
	 * 包括： a.物品的名称name，由字母和数字组成，长度不超过100，且不为空； b.价格 price，为正整数； c.销量 sale，为非负整数；
	 * 保证数据都在int范围内。 然后排序的关键字相等，就按name的字典序排序，保证没有重复的name。
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
				//按价格从低到高排序
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
				//按价格从高到低排序
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
				//按销量从高到低排序
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
		// 按名称从小到大排序
		if (this.name.compareTo(o.name) > 0) {
			return 1;
		} else if (this.name.compareTo(o.name) < 0) {
			return -1;
		}
		// 相等情况
		return 0;
	}
}