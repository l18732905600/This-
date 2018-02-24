package cn.itcast.demo03;
/*
 * 匿名对象是指创建对象时，只有创建对象的语句，却没有把对象地址值赋值给某个变量。
 * 
 * 匿名对象只能使用一次,使用完毕就会从内存中被垃圾回收(消失)
 * 
 * 匿名对象可以作为方法的参数,或者方法的返回值
 */
public class Demo {
	public static void main(String[] args) {
		//创建一个有名的对象,对象赋值给了一个变量,所以可以多次使用
		Student s1 = new Student();//0x999
		s1.show();
		s1.show();
		System.out.println("--------------");
		//创建一个匿名对象,只能使用一次
		new Student().show();//0x666
		new Student().show();//0x888
		System.out.println("--------------");
		//调用参数是Student的方法
		useStudent(s1);//0x999
		System.out.println(s1.getName());//"张三"
		useStudent(new Student());//0x1234
		System.out.println("--------------");
		//调用获取学生对象的方法,方法的返回值是一个对象,就必须使用一个该对象的数据类型变量接收
		Student s2 = getStudent();//s2 = 0x3333
		s2.show();
	}
	
	/*
	 * 定义一个方法,方法返回值类型为Student
	 * 方法内部就必须返回一个Student对象
	 * 
	 * public static int getInt(){
	 * 	return 1;
	 * }
	 * 
	 * public static Student getStudent(){
	 * 	return Student对象;
	 * }
	 */
	public static Student getStudent(){
		/*Student s1 = new Student();//0x3333
		return s1;//0x3333*/
		return new Student();//对象只使用一次,就作为返回值,所以可以使用匿名对象
	}
	
	/*
	 * 定义一个方法,方法的参数是自定义类型Student变量
	 * 定义方法时写的参数称之为形式参数,可以没有值,但是使用的时候必须有值
	 * 调用方法的时候,就必选创建对象,传递过来,给形式参数赋值
	 * 
	 * public static void useStudent(int a){syso(a)}
	 * useStudent(10);
	 * 
	 * public static void useStudent(Student s){}
	 * useStudent(s1);
	 * useStudent(new Student());//匿名对象作为参数,只使用一次作为参数,后边不在用
	 * 
	 * Student s = 0x999-->new Student();-->name = "张三"
	 * Student s = 0x1234-->ew Student();
	 */
	public static void useStudent(Student s){
		s.show();
		s.setName("张三");
	}
}
