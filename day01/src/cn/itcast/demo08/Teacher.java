package cn.itcast.demo08;
/*
 * 定义讲师类,是员工的一种,所以继续员工类
 * 
 * 继承:子类继承父类会自动拥有父类非私有的成员(成员变量,成员方法)
 * 
 * 格式:public class 子类 extends 父类{}
 */
public class Teacher extends Employee{
	public void sleep(){
		System.out.println("中午要午休,最少要睡15分钟!");
	}
	
	public void show(){
		System.out.println(name);
	}
}
