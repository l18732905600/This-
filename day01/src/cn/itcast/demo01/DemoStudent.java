package cn.itcast.demo01;

public class DemoStudent {
	public static void main(String[] args) {
		//ʹ�ÿղ������췽����������
		Student s1 = new Student();
		//ʹ��set�����������Ը�ֵ
		s1.setName("����");
		s1.setAge(18);
		//ʹ��get������ȡ���Ե�ֵ
		System.out.println(s1.getName()+"..."+s1.getAge());
		//�������еĳ�Ա����
		s1.study();
		
		//ʹ�����������췽����������
		Student s2 = new Student("����", 40);
		//ʹ��get������ȡ���Ե�ֵ
		System.out.println(s2.getName()+"..."+s2.getAge());
		//ʹ��set�����޸����Ե�ֵ
		s2.setName("¥������");
		//�������еĳ�Ա����
		s2.study();
	}
}