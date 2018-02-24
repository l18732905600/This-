package cn.itcast.demo04;
/*
 * java.lang.String类:String类是引用数据类型
 * 
 * String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现(对象)。 
 * 
 * String s = "abc";-->隐含一个创建对象的过程
 * 
 * String是一个常量,值不能改变,底层是一个字符数组,由多个字符组成
 *  private final char value[] = new char[0];
 *  数组被final修饰之后,数组的地址不能改变,所以就是一个常量
 *  只要是常量就存在方法区中的常量池中
 */
public class Demo01String {
	public static void main(String[] args) {
		method_05();
	}

	/*
	 * 去除空格和分割功能方法
		String trim()去除字符串两端空格
		String[] split(String str)按照指定符号分割字符串
	 */
	private static void method_05() {
		//String trim()去除字符串两端空格
		System.out.println(" abc abc abc ".trim());//"abc abc abc"
		System.out.println("admin ".trim().equals("admin"));//true
		//String[] split(String str)按照指定符号分割字符串
		String s1 = "abc bbc cbc";
		String[] arr1 = s1.split(" ");//把一个长的字符串,根据空格切割为3个短的字符串
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("--------------");
		//选中变量-->alt + shift + r-->相同名称变量名一起改变
		String s2 = "abc,bbc,cbc";
		String[] arr2 = s2.split(",");//把一个长的字符串,根据空格切割为3个短的字符串
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("--------------");
		String s3 = "abc.bbc.cbc";//.有特殊含义,代表所有的字符,可以使用转移字符把有特殊含义的字符变为普通的字符\
		String[] arr3 = s3.split("\\.");//把一个长的字符串,根据空格切割为3个短的字符串
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("\t"+"hello");//转移字符,把普通的字符t,变成一个有特殊含义的字符tab-->制表符
	}

	/*
	 * 转换功能方法
		char[] toCharArray():把字符串转换为字符数组
		String toLowerCase():把字符串转换为小写字符串
		String toUpperCase():把字符串转换为大写字符串
	 */
	private static void method_04() {
		//char[] toCharArray():把字符串转换为字符数组
		char[] cs = "abc".toCharArray();
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		//String toLowerCase():把字符串中的字母转换为小写,其它字符不变
		//String toUpperCase():把字符串中的字母转换为大写,其它字符不变
		System.out.println("ABCabc123!@!@#".toLowerCase());//abcabc123!@!@#
		System.out.println("ABCabc123!@!@#".toUpperCase());//ABCABC123!@!@#
	}

	/*
	 * 获取功能方法
		int length():获取字符串的长度，其实也就是字符个数
		char charAt(int index):获取指定索引处的字符
		int indexOf(String str):获取str在字符串对象中第一次出现的索引,没有返回-1
		String substring(int beginIndex):从start开始截取字符串到字符串结尾
		String substring(int beginIndex,int endIndex):从start开始，到end结束截取字符串;包括beginIndex，不包括endIndex
	 */
	private static void method_03() {
		//int length():获取字符串的长度，其实也就是字符个数
		int length = "nihao".length();
		System.out.println("length:"+length);//length:5
		
		//char charAt(int index):获取指定索引处的字符
		String s = "hello";
		//char底层就是存储一个数字,可以进行计算,计算时会把自己提升为int类型
		//System.out.println(s.charAt(0)+1);//h-->104+1-->105(int)
		System.out.println(s.charAt(0));//h
		System.out.println(s.charAt(1));//h
		System.out.println(s.charAt(2));//h
		System.out.println(s.charAt(3));//h
		System.out.println(s.charAt(4));//h
		System.out.println("-------------");
		//使用length()+charAt(),可以遍历字符串
		for(int i=0; i<s.length();i++){
			System.out.println(s.charAt(i));
		}
		System.out.println("-------------");
		//int indexOf(String str):获取str在字符串对象中第一次出现的索引,没有返回-1
		System.out.println("hello".indexOf("e"));//1
		System.out.println("hello".indexOf("l"));//2
		System.out.println("hello".indexOf("WW"));//-1
		//String substring(int beginIndex):从start开始截取字符串到字符串结尾
		String sub1 = "safasdfsdafasdf".substring(6);
		System.out.println("sub1:"+sub1);//sub1:fsdafasdf
		//String substring(int beginIndex,int endIndex):从start开始，到end结束截取字符串;包括beginIndex，不包括endIndex
		String sub2 = "safasdfsdafasdf".substring(1, 3);
		System.out.println("sub2:"+sub2);//sub2:af
		
	}

	/*
	 * 判断功能方法
		boolean equals(String s):比较字符串的内容是否相同
		boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
		boolean startsWith(String str):判断字符串对象是否以指定的str开头
		boolean endsWith(String str):判断字符串对象是否以指定的str结尾
	 */
	private static void method_02() {
		System.out.println("abc".equals("abc"));//true
		System.out.println("abc".equals("Abc"));//false
		System.out.println("abc".equalsIgnoreCase("Abc"));//true
		System.out.println("----------------");
		System.out.println("helloWorld".startsWith("hello"));//true
		System.out.println("helloWorld".startsWith("Hello"));//false
		System.out.println("helloWorld".startsWith("helloWorld"));//true
		System.out.println("----------------");
		//endsWith可以用于过滤器
		System.out.println("Demo.java".endsWith(".java"));//true
		System.out.println("Demo.class".endsWith(".java"));//false
	}

	/*
	 * String类的构造方法
	 * public String(String original)把字符串数据封装成字符串对象
	 * public String(char[] value)把字符数组的数据封装成字符串对象
	 * public String(char[] value,int offset,int count)把字符数组中的一部分数据封装成字符串对象
	 * 直接赋值也可以是一个对象(定义一个字符串变量)
	 * 注意：字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据。
	 * 原因:因为直接打印对象的名字就是调用对象的toString方法,String类重写了这个方法,打印的是字符串中的内容
	 */
	private static void method_01() {
		//直接赋值也可以是一个对象(定义一个字符串变量)
		String s1 = "abc";
		System.out.println(s1);//创建的字符数组在常量池中
		
		//public String(String original)把字符串数据封装成字符串对象
		String s2 = new String("abc");
		System.out.println(s2);//创建2个对象new String();在堆中  "abc"常量池中
		System.out.println(s1==s2);//false
		
		//public String(char[] value)把字符数组的数据封装成字符串对象
		char[] cs = {'a','b','c'};
		String s3 = new String(cs);
		System.out.println(s3);
		
		//public String(char[] value,int offset,int count)把字符数组中的一部分数据封装成字符串对象
		String s4 = new String(cs, 1, 2);
		System.out.println(s4);
	}
}
