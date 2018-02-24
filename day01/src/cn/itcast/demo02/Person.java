package cn.itcast.demo02;

/*
 * this关键字
 * 
 * this代表本类对象的引用(this就是对象),哪个对象调用了方法,方法中的this就是哪个对象
 * 
 * this的作用:
 * 	当成员变量和局部变量同名的时候,使用this可以区分成员和局部变量
 * 	this.变量为成员变量
 * 
 */
public class Person {
	private String name;
	private int age;

	//对象p调用了show方法,方法中的this就是对象p
	public void show() {
		System.out.println("this:"+this);//this:cn.itcast.demo02.Person@179935d
		String name = "旺财";
		int age = 20;
		System.out.println(name + "..." + age);//变量的就近访问原则
		System.out.println(this.name+"..."+this.age);//this.变量代表成员变量
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
	}


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
