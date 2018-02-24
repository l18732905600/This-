package cn.itcast.demo01;
/*
 * 面向对象:当我们遇到一件事情的时候,不在自己一步一步的完成,找一个具有完成该事情能力的对象,调用对象中的方法来完成
 * 面向对象基于面向过程
 * 面向过程:当我们遇到一件事情的时候,我自己一步一步完成
 * 
 * 现实生活中的事物-->学生
 * 	属性:姓名,年龄
 * 	行为(功能):学习
 * 
 * 把现实生活中的事物,抽象成Java中的类-->Student
 * 	把事物的属性抽象成类中的成员变量(写在类中,方法外边的变量)
 * 	把事物的功能抽象成类中的成员方法(需要去掉static修饰符)
 * 
 * 封装:
 * 	私有成员变量,提供公共的访问方式getter/setter方法
 * 
 * 构造方法:创建对象就是调用类中的构造方法
 * 	作用:
 * 		1.给自定义类型变量进行初始化赋值
 * 		2.给成员变量进行赋值
 * 	特点:
 * 		1.如果类中没有明确的给出构造方法,那么Java会给我们默认添加一个空参构造方法 public Student(){}
 * 		2.如果类中明确的给出构造方法(自定义了构造方法),那么Java不会给我们默认添加一个空参构造方法,所以要使用空参数构造必须手动写出
 * 		3.构造方法之间可以重载(在一个类中,出现了方法名相同,但是参数列表不同的方法)
 */
public class Student {
	//属性-->成员变量
	private String name;
	private int age;
	
	//空参数构造方法
	public Student() {
	}
	
	//满参数构造方法
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//功能-->成员方法
	public void study(){
		System.out.println("姓名:"+name+",年龄"+age+",正在努力敲代码!");
	}

	//公共的访问方式getter/setter方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
