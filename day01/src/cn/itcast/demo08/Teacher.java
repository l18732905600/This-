package cn.itcast.demo08;
/*
 * ���彲ʦ��,��Ա����һ��,���Լ���Ա����
 * 
 * �̳�:����̳и�����Զ�ӵ�и����˽�еĳ�Ա(��Ա����,��Ա����)
 * 
 * ��ʽ:public class ���� extends ����{}
 */
public class Teacher extends Employee{
	public void sleep(){
		System.out.println("����Ҫ����,����Ҫ˯15����!");
	}
	
	public void show(){
		System.out.println(name);
	}
}