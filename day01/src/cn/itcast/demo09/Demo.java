package cn.itcast.demo09;
/*
 * 继承-子类中访问父类成员变量特点:
 * 	如果子类没有成员变量,使用父类的成员变量
 * 	如果父类有成员变量,子类也有该成员变量,则使用子类自己的
 * 	如果父类没有成员变量,子类有成员变量,则使用子类自己的
 * 	如果父类没有成员变量,子类和没有成员变量,则编译报错
 */
public class Demo {
	public static void main(String[] args) {
		Zi zi = new Zi();
		System.out.println(zi.num);
		System.out.println(zi.num2);
	}
}
