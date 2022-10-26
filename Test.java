public class Test{
	public static void main(String[] args){
		//只能通过Dragon类提供的静态方法来获取到Dragon对象
		Dragon g1 = Dragon.getInstance();
		Dragon g2 = Dragon.getInstance();
		Dragon g3 = Dragon.getInstance();
		//都是同一个对象，内存地址都一样
		System.out.println(g1 == g2);
		System.out.println(g2 == g3);
	}
}

/*
//饿汉式单例模式(在不调用静态方法getInstance()的情况下就会实例化对象)
class Dragon{
	//构造方法私有化
	private Dragon(){

	}
	//给一个私有的Dragon类型的静态变量,并静态属性指向实例
	private static Dragon instance = new Dragon();

	//提供一个公开的静态方法getInstance()使得外部可以获取此实例，且此实例具有唯一性
	public static Dragon getInstance(){
		return instance;
	}
}
*/

//饱汉式单例模式(只有在调用静态方法getInstance()的情况下才会实例化对象，且只实例化一次)
class Dragon{
	//构造方法私有化
	private Dragon(){

	}
	//给一个私有的Dragon类型静态变量，不赋值，成员变量默认为null
	private static Dragon instance;

	//提供一个公开的静态方法getInstance()使得外部可以获取此实例，当instance为空时才获取，保证实例的唯一性
	public static Dragon getInstance(){
		if(instance == null){
			instance = new Dragon();
		}
		return instance;
	}
}