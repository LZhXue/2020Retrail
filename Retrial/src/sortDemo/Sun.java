package sortDemo;

public class Sun {
	class Moon{
		
	}
	//private �����ⲿ���� ���ܹ�ֱ��ʵ���� sun��  ���Ǿ���Ҫ���ڲ�����һ��ʵ��
//	���ֱ���ֻ��һ��
//	�������ⲻִ�г��� ֱʵ���� ����
//	�ȴ�����̬���� Ȼ����ʹ�þ�̬�������з���
	
	//����ʽ  ����ʽ 
	
	private static Sun insTance=null; //����ʽ 
	
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
