package cn.itcast.demo10;

public class Zi extends Fu{
	/*
	 * 子类中出现了和父类一模一样(修饰符,返回值类型,方法名,参数列表)的方法,称之为重写了父类的方法
	 * 方法重写是发生在两个类之间的,重写叫Override
	 */
	public void show(){
		System.out.println("Zi类的重写父类的show方法");
	}
	
	/*
	 * 在一个类中出现了同名的方法,但是参数列表不同,称之为方法重载
	 * 重写叫Overload
	 */
	public void show(int a){
		System.out.println("Zi类自己的show a方法");
	}
}
