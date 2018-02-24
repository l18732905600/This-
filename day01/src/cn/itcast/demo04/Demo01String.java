package cn.itcast.demo04;
/*
 * java.lang.String��:String����������������
 * 
 * String ������ַ�����Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ��(����)�� 
 * 
 * String s = "abc";-->����һ����������Ĺ���
 * 
 * String��һ������,ֵ���ܸı�,�ײ���һ���ַ�����,�ɶ���ַ����
 *  private final char value[] = new char[0];
 *  ���鱻final����֮��,����ĵ�ַ���ܸı�,���Ծ���һ������
 *  ֻҪ�ǳ����ʹ��ڷ������еĳ�������
 */
public class Demo01String {
	public static void main(String[] args) {
		method_05();
	}

	/*
	 * ȥ���ո�ͷָ�ܷ���
		String trim()ȥ���ַ������˿ո�
		String[] split(String str)����ָ�����ŷָ��ַ���
	 */
	private static void method_05() {
		//String trim()ȥ���ַ������˿ո�
		System.out.println(" abc abc abc ".trim());//"abc abc abc"
		System.out.println("admin ".trim().equals("admin"));//true
		//String[] split(String str)����ָ�����ŷָ��ַ���
		String s1 = "abc bbc cbc";
		String[] arr1 = s1.split(" ");//��һ�������ַ���,���ݿո��и�Ϊ3���̵��ַ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("--------------");
		//ѡ�б���-->alt + shift + r-->��ͬ���Ʊ�����һ��ı�
		String s2 = "abc,bbc,cbc";
		String[] arr2 = s2.split(",");//��һ�������ַ���,���ݿո��и�Ϊ3���̵��ַ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("--------------");
		String s3 = "abc.bbc.cbc";//.�����⺬��,�������е��ַ�,����ʹ��ת���ַ��������⺬����ַ���Ϊ��ͨ���ַ�\
		String[] arr3 = s3.split("\\.");//��һ�������ַ���,���ݿո��и�Ϊ3���̵��ַ���
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("\t"+"hello");//ת���ַ�,����ͨ���ַ�t,���һ�������⺬����ַ�tab-->�Ʊ���
	}

	/*
	 * ת�����ܷ���
		char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		String toLowerCase():���ַ���ת��ΪСд�ַ���
		String toUpperCase():���ַ���ת��Ϊ��д�ַ���
	 */
	private static void method_04() {
		//char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		char[] cs = "abc".toCharArray();
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		//String toLowerCase():���ַ����е���ĸת��ΪСд,�����ַ�����
		//String toUpperCase():���ַ����е���ĸת��Ϊ��д,�����ַ�����
		System.out.println("ABCabc123!@!@#".toLowerCase());//abcabc123!@!@#
		System.out.println("ABCabc123!@!@#".toUpperCase());//ABCABC123!@!@#
	}

	/*
	 * ��ȡ���ܷ���
		int length():��ȡ�ַ����ĳ��ȣ���ʵҲ�����ַ�����
		char charAt(int index):��ȡָ�����������ַ�
		int indexOf(String str):��ȡstr���ַ��������е�һ�γ��ֵ�����,û�з���-1
		String substring(int beginIndex):��start��ʼ��ȡ�ַ������ַ�����β
		String substring(int beginIndex,int endIndex):��start��ʼ����end������ȡ�ַ���;����beginIndex��������endIndex
	 */
	private static void method_03() {
		//int length():��ȡ�ַ����ĳ��ȣ���ʵҲ�����ַ�����
		int length = "nihao".length();
		System.out.println("length:"+length);//length:5
		
		//char charAt(int index):��ȡָ�����������ַ�
		String s = "hello";
		//char�ײ���Ǵ洢һ������,���Խ��м���,����ʱ����Լ�����Ϊint����
		//System.out.println(s.charAt(0)+1);//h-->104+1-->105(int)
		System.out.println(s.charAt(0));//h
		System.out.println(s.charAt(1));//h
		System.out.println(s.charAt(2));//h
		System.out.println(s.charAt(3));//h
		System.out.println(s.charAt(4));//h
		System.out.println("-------------");
		//ʹ��length()+charAt(),���Ա����ַ���
		for(int i=0; i<s.length();i++){
			System.out.println(s.charAt(i));
		}
		System.out.println("-------------");
		//int indexOf(String str):��ȡstr���ַ��������е�һ�γ��ֵ�����,û�з���-1
		System.out.println("hello".indexOf("e"));//1
		System.out.println("hello".indexOf("l"));//2
		System.out.println("hello".indexOf("WW"));//-1
		//String substring(int beginIndex):��start��ʼ��ȡ�ַ������ַ�����β
		String sub1 = "safasdfsdafasdf".substring(6);
		System.out.println("sub1:"+sub1);//sub1:fsdafasdf
		//String substring(int beginIndex,int endIndex):��start��ʼ����end������ȡ�ַ���;����beginIndex��������endIndex
		String sub2 = "safasdfsdafasdf".substring(1, 3);
		System.out.println("sub2:"+sub2);//sub2:af
		
	}

	/*
	 * �жϹ��ܷ���
		boolean equals(String s):�Ƚ��ַ����������Ƿ���ͬ
		boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		boolean startsWith(String str):�ж��ַ��������Ƿ���ָ����str��ͷ
		boolean endsWith(String str):�ж��ַ��������Ƿ���ָ����str��β
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
		//endsWith�������ڹ�����
		System.out.println("Demo.java".endsWith(".java"));//true
		System.out.println("Demo.class".endsWith(".java"));//false
	}

	/*
	 * String��Ĺ��췽��
	 * public String(String original)���ַ������ݷ�װ���ַ�������
	 * public String(char[] value)���ַ���������ݷ�װ���ַ�������
	 * public String(char[] value,int offset,int count)���ַ������е�һ�������ݷ�װ���ַ�������
	 * ֱ�Ӹ�ֵҲ������һ������(����һ���ַ�������)
	 * ע�⣺�ַ�����һ�ֱȽ�����������������ͣ�ֱ������ַ�������������Ǹö����е����ݡ�
	 * ԭ��:��Ϊֱ�Ӵ�ӡ��������־��ǵ��ö����toString����,String����д���������,��ӡ�����ַ����е�����
	 */
	private static void method_01() {
		//ֱ�Ӹ�ֵҲ������һ������(����һ���ַ�������)
		String s1 = "abc";
		System.out.println(s1);//�������ַ������ڳ�������
		
		//public String(String original)���ַ������ݷ�װ���ַ�������
		String s2 = new String("abc");
		System.out.println(s2);//����2������new String();�ڶ���  "abc"��������
		System.out.println(s1==s2);//false
		
		//public String(char[] value)���ַ���������ݷ�װ���ַ�������
		char[] cs = {'a','b','c'};
		String s3 = new String(cs);
		System.out.println(s3);
		
		//public String(char[] value,int offset,int count)���ַ������е�һ�������ݷ�װ���ַ�������
		String s4 = new String(cs, 1, 2);
		System.out.println(s4);
	}
}