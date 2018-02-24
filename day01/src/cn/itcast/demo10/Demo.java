package cn.itcast.demo10;
/*
 * 继承-子类中访问父类成员方法特点
 *  如果子类没有成员方法,使用父类的成员方法
 * 	如果父类有成员方法,子类也有该成员方法,则使用子类自己的
 * 	如果父类没有成员方法,子类有成员方法,则使用子类自己的
 * 	如果父类没有成员方法,子类和没有成员方法,则编译报错
 */
public class Demo {
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.show();
		zi.show(10);
		//zi.show2();//编译报错
	}
}
