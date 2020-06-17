
public class A_1220 {
	/*
	 * 题目描述 
	 * Superbin最近在研究初等数论，初等数论是研究数的规律，特别是整数性质的数学分支。它是数论的一个最古老的分支。它以算术方法为主要研究方法，主要内容有整数的整除理论、同余理论、
	 * 连分数理论和某些特殊不定方程。 a2+b2=c2 是定义在正整数域的等式，现在，你需要求100以内的能使该等式成立的所有三元组（a,b,c)，a < b < c. 是不是很简单？赶快AC了，升起你的第一个气球吧！
	 * 
	 * 输入 
	 * 无
	 * 
	 * 输出 
	 * 请按顺序输出所有满足要求的三元组(a,b,c)。顺序：按a从小到大，如果a相同按b从小到大。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 101;
		for(int i = 1;i<n-2;i++) {
			for(int j = i+1;j<n;j++) {
				for(int k = j+1;k<n;k++) {
					if(i*i+j*j==k*k) {
						System.out.println("("+i+","+j+","+k+")");
					}
				}
			}
		}
	}

}
