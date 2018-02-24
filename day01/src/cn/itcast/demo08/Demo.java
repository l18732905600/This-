package cn.itcast.demo08;
/*
 * 测试子类继承父类之后,是否拥有父类的非私有成员
 * 
 * 面向对象的三大特性:封装,继承,多态
 * 
 * 继承的好处:
 * 	1.可以提高代码的复用性(重复使用)
 * 	2.为多态提供了前提
 * 
 * 选中类:ctrl+t-->查看继承关系
 */
public class Demo {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		//子类可以使用父类继承过来的属性和方法
		t.name = "白彦军";
		t.work();
		t.show();
		//子类使用自己的方法
		t.sleep();
		
		ZhuJiao zj = new ZhuJiao();
		zj.name = "马凯";
		zj.work();
	}
}
