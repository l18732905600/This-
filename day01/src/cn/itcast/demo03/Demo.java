package cn.itcast.demo03;
/*
 * ����������ָ��������ʱ��ֻ�д����������䣬ȴû�аѶ����ֵַ��ֵ��ĳ��������
 * 
 * ��������ֻ��ʹ��һ��,ʹ����Ͼͻ���ڴ��б���������(��ʧ)
 * 
 * �������������Ϊ�����Ĳ���,���߷����ķ���ֵ
 */
public class Demo {
	public static void main(String[] args) {
		//����һ�������Ķ���,����ֵ����һ������,���Կ��Զ��ʹ��
		Student s1 = new Student();//0x999
		s1.show();
		s1.show();
		System.out.println("--------------");
		//����һ����������,ֻ��ʹ��һ��
		new Student().show();//0x666
		new Student().show();//0x888
		System.out.println("--------------");
		//���ò�����Student�ķ���
		useStudent(s1);//0x999
		System.out.println(s1.getName());//"����"
		useStudent(new Student());//0x1234
		System.out.println("--------------");
		//���û�ȡѧ������ķ���,�����ķ���ֵ��һ������,�ͱ���ʹ��һ���ö�����������ͱ�������
		Student s2 = getStudent();//s2 = 0x3333
		s2.show();
	}
	
	/*
	 * ����һ������,��������ֵ����ΪStudent
	 * �����ڲ��ͱ��뷵��һ��Student����
	 * 
	 * public static int getInt(){
	 * 	return 1;
	 * }
	 * 
	 * public static Student getStudent(){
	 * 	return Student����;
	 * }
	 */
	public static Student getStudent(){
		/*Student s1 = new Student();//0x3333
		return s1;//0x3333*/
		return new Student();//����ֻʹ��һ��,����Ϊ����ֵ,���Կ���ʹ����������
	}
	
	/*
	 * ����һ������,�����Ĳ������Զ�������Student����
	 * ���巽��ʱд�Ĳ�����֮Ϊ��ʽ����,����û��ֵ,����ʹ�õ�ʱ�������ֵ
	 * ���÷�����ʱ��,�ͱ�ѡ��������,���ݹ���,����ʽ������ֵ
	 * 
	 * public static void useStudent(int a){syso(a)}
	 * useStudent(10);
	 * 
	 * public static void useStudent(Student s){}
	 * useStudent(s1);
	 * useStudent(new Student());//����������Ϊ����,ֻʹ��һ����Ϊ����,��߲�����
	 * 
	 * Student s = 0x999-->new Student();-->name = "����"
	 * Student s = 0x1234-->ew Student();
	 */
	public static void useStudent(Student s){
		s.show();
		s.setName("����");
	}
}