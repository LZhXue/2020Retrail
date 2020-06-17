package sortDemo;

public class Sun {
	class Moon{
		
	}
	//private 导致外部程序 不能够直接实例化 sun类  我们就需要在内部创建一个实例
//	保持变量只有一份
//	不允许外不执行程序 直实例化 对象
//	先创建静态变量 然后在使用静态方法进行返回
	
	//饿汉式  懒汉式 
	
	private static Sun insTance=null; //饿汉式 
	
	private Sun() {
		
	}
	
	public static Sun getInstance()
	{
		if(insTance==null) {
			insTance=new Sun();
		}
		return insTance;
	}
	
	
}
