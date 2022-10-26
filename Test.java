public class Test{
	public static void main(String[] args){
		//ֻ��ͨ��Dragon���ṩ�ľ�̬��������ȡ��Dragon����
		Dragon g1 = Dragon.getInstance();
		Dragon g2 = Dragon.getInstance();
		Dragon g3 = Dragon.getInstance();
		//����ͬһ�������ڴ��ַ��һ��
		System.out.println(g1 == g2);
		System.out.println(g2 == g3);
	}
}

/*
//����ʽ����ģʽ(�ڲ����þ�̬����getInstance()������¾ͻ�ʵ��������)
class Dragon{
	//���췽��˽�л�
	private Dragon(){

	}
	//��һ��˽�е�Dragon���͵ľ�̬����,����̬����ָ��ʵ��
	private static Dragon instance = new Dragon();

	//�ṩһ�������ľ�̬����getInstance()ʹ���ⲿ���Ի�ȡ��ʵ�����Ҵ�ʵ������Ψһ��
	public static Dragon getInstance(){
		return instance;
	}
}
*/

//����ʽ����ģʽ(ֻ���ڵ��þ�̬����getInstance()������²Ż�ʵ����������ֻʵ����һ��)
class Dragon{
	//���췽��˽�л�
	private Dragon(){

	}
	//��һ��˽�е�Dragon���;�̬����������ֵ����Ա����Ĭ��Ϊnull
	private static Dragon instance;

	//�ṩһ�������ľ�̬����getInstance()ʹ���ⲿ���Ի�ȡ��ʵ������instanceΪ��ʱ�Ż�ȡ����֤ʵ����Ψһ��
	public static Dragon getInstance(){
		if(instance == null){
			instance = new Dragon();
		}
		return instance;
	}
}