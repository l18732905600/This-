package cn.itcast.demo01;

public class DemoStudent {
	public static void main(String[] args) {
		//使用空参数构造方法创建对象
		Student s1 = new Student();
		//使用set方法进行属性赋值
		s1.setName("老三");
		s1.setAge(18);
		//使用get方法获取属性的值
		System.out.println(s1.getName()+"..."+s1.getAge());
		//访问类中的成员方法
		s1.study();
		
		//使用满参数构造方法创建对象
		Student s2 = new Student("老王", 40);
		//使用get方法获取属性的值
		System.out.println(s2.getName()+"..."+s2.getAge());
		//使用set方法修改属性的值
		s2.setName("楼上老宋");
		//访问类中的成员方法
		s2.study();
	}
}
