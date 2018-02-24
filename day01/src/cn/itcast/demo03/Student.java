package cn.itcast.demo03;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("Student类的show方法!" + name);
	}
}
