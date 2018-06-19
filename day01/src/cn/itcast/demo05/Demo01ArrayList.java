package cn.itcast.demo05;

import java.util.ArrayList;

/*
 * java.util.ArrayList集合:底层是一个长度可以变化的数组
 * 
 * 集合和数组的区别:
 * 	数组:长度是固定的;可以存储基本数据类型,也可以存储对象(引用数据类型的值)
 * 	集合:长度是可以变化的;只能存储对象(引用数据类型的值)
 * 		ArraryList<E>:E,泛型,集合中的元素的数据类型
 * 		ArrayList<String>
 * 		ArrayList<Student>
 * 		使用集合存储基本数据类型:定义集合的时候需要使用基本数据类型的包装类(引用数据类型的表示形式)
 * 			int-->Integer
 * 			char-->Character
 * 			其它的首字母大写
 * 			ArrayList<Integer>	
 */
public class Demo01ArrayList {
	public static void main(String[] args) {
		method_02();
	}

	/*
	 * 3.2	使用集合存储自定义类型并遍历
	 */
	private static void method_02() {
		ArrayList<Animal> list =  new ArrayList<Animal>();
		list.add(new Animal("Tom", 5));
		list.add(new Animal("杰瑞", 3));
		list.add(new Animal("旺财", 10));
		
		//遍历集合,取出集合中的元素,元素就是动物Animal
		for(int i=0; i<list.size(); i++){
			//存储的是动物,取出的也是动物 ,可以定义一个动物变量接收
			Animal thisA = list.get(i);
			//打印动物的属性
			System.out.println(thisA.getName()+"..."+thisA.getAge());
			/*System.out.println(thisA);//直接打印对象的名字,就是调用对象的toString方法
			System.out.println(thisA.toString());
			System.out.println("--------------");*/
		}
	}

	/*
	 * 3.1	使用集合存储字符串并遍历
	 */
	private static void method_01() {
		//ctrl+shift+o
		ArrayList<String> list = new ArrayList<String>();
		//list.add("aaa");往集合的末尾追加数据
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//list.add(int index,新元素);//往指定的索引处插入一个元素
		list.add(1, "www");
		
		//遍历集合
		//i:集合的索引  list.size():获取集合的长度  list.get(i):获取指定索引处的元素
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));

			//368398
		}
		
	}
}
