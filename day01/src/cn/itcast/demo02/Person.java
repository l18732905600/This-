package cn.itcast.demo02;

/*
 * this�ؼ���
 * 
 * this����������������(this���Ƕ���),�ĸ���������˷���,�����е�this�����ĸ�����
 * 
 * this������:
 * 	����Ա�����;ֲ�����ͬ����ʱ��,ʹ��this�������ֳ�Ա�;ֲ�����
 * 	this.����Ϊ��Ա����
 * 
 */
public class Person {
	private String name;
	private int age;

	//����p������show����,�����е�this���Ƕ���p
	public void show() {
		System.out.println("this:"+this);//this:cn.itcast.demo02.Person@179935d
		String name = "����";
		int age = 20;
		System.out.println(name + "..." + age);//�����ľͽ�����ԭ��
		System.out.println(this.name+"..."+this.age);//this.����������Ա����
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