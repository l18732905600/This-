package cn.itcast.demo05;

import java.util.ArrayList;

/*
 * java.util.ArrayList����:�ײ���һ�����ȿ��Ա仯������
 * 
 * ���Ϻ����������:
 * 	����:�����ǹ̶���;���Դ洢������������,Ҳ���Դ洢����(�����������͵�ֵ)
 * 	����:�����ǿ��Ա仯��;ֻ�ܴ洢����(�����������͵�ֵ)
 * 		ArraryList<E>:E,����,�����е�Ԫ�ص���������
 * 		ArrayList<String>
 * 		ArrayList<Student>
 * 		ʹ�ü��ϴ洢������������:���弯�ϵ�ʱ����Ҫʹ�û����������͵İ�װ��(�����������͵ı�ʾ��ʽ)
 * 			int-->Integer
 * 			char-->Character
 * 			����������ĸ��д
 * 			ArrayList<Integer>	
 */
public class Demo01ArrayList {
	public static void main(String[] args) {
		method_02();
	}

	/*
	 * 3.2	ʹ�ü��ϴ洢�Զ������Ͳ�����
	 */
	private static void method_02() {
		ArrayList<Animal> list =  new ArrayList<Animal>();
		list.add(new Animal("Tom", 5));
		list.add(new Animal("����", 3));
		list.add(new Animal("����", 10));
		
		//��������,ȡ�������е�Ԫ��,Ԫ�ؾ��Ƕ���Animal
		for(int i=0; i<list.size(); i++){
			//�洢���Ƕ���,ȡ����Ҳ�Ƕ��� ,���Զ���һ�������������
			Animal thisA = list.get(i);
			//��ӡ���������
			System.out.println(thisA.getName()+"..."+thisA.getAge());
			/*System.out.println(thisA);//ֱ�Ӵ�ӡ���������,���ǵ��ö����toString����
			System.out.println(thisA.toString());
			System.out.println("--------------");*/
		}
	}

	/*
	 * 3.1	ʹ�ü��ϴ洢�ַ���������
	 */
	private static void method_01() {
		//ctrl+shift+o
		ArrayList<String> list = new ArrayList<String>();
		//list.add("aaa");�����ϵ�ĩβ׷������
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//list.add(int index,��Ԫ��);//��ָ��������������һ��Ԫ��
		list.add(1, "www");
		
		//��������
		//i:���ϵ�����  list.size():��ȡ���ϵĳ���  list.get(i):��ȡָ����������Ԫ��
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}
}