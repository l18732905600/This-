package cn.itcast.demo06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * IO流:
 * 	I:input,输入,读
 * 	O:output,输出,写
 * 	流:数据流(字符,字节)
 * 
 * 字符流:
 * 	输入:FileReader,字符输入流
 * 	输出:FileWriter,字符输出流
 * 缓冲流:	
 * 	输入:BufferedReader,字符缓冲输入流:构造方法中传递字符输入流对象,给字符输入流对象增加一个缓冲区,提高字符输入流的效率
 * 	输出:BufferedWriter,字符缓冲输出流:构造方法中传递字符输出流对象,给字符输处流对象增加一个缓冲区,提高字符输出流的效率
 * 
 * 成员方法:
 * 	FileWriter  写数据: 字符,字符数组,字符串
 * 	BufferedWriter 写数据: 字符,字符数组,字符串,换行
 * 	FileReader 读数据: 字符,字符数组
 * 	BufferedReader 读数据:字符,字符数组,文本行
 */
public class Demo01IO {
	public static void main(String[] args) throws IOException {
		copy_02();
	}

	/*
	 * 使用BufferedWriter+BufferedReader特有的方法复制文本文件
	 * BufferedWriter:写换行 newLine()
	 * BufferedReader:一次读取一行 readLine(),方法返回值是String,读取到null结束
	 * readLine方法不读取换行符,所以在写的时候需要手动添加换行符
	 */
	private static void copy_02() throws IOException {
		//1.创建FileReader对象,并且绑定数据源
		FileReader fr = new FileReader("a.txt");
		//2.创建FileWriter对象,并且绑定数据的目的地
		FileWriter fw = new FileWriter("copy.txt");
		//3.创建字符缓冲输入流对象,构造方法中传入FileReader对象,提高FileReader的效率
		BufferedReader br = new BufferedReader(fr);
		//4.创建字符缓冲输出流对象,构造方法中传入FileWriter对象,提高FileWriter的效率
		BufferedWriter bw = new BufferedWriter(fw);
		//5.使用BufferedReader中特有读取一行的方法,读取数据
		String line;
		while((line = br.readLine())!=null){
			//调用BufferedWriter中写字符串的方法,把数据写入到内存缓冲区中
			bw.write(line);
			//写换行
			bw.newLine();
			//调用刷新方法
			bw.flush();
		}
		//6.释放资源
		bw.close();
		br.close();
	}

	/*
	 * 使用FileWriter+FileReader复制文本文件
	 * 文本文件:使用记事本打开,能看懂的文件
	 */
	private static void copy_01() throws IOException {
		//1.创建FileReader对象,并且绑定数据源
		FileReader fr = new FileReader("a.txt");
		//2.创建FileWriter对象,并且绑定数据的目的地
		FileWriter fw = new FileWriter("copy.txt");
		/*//3.使用FileReader中一次读取一个字符,读取数据
		int len = 0;//读取到返回的字符
		while((len = fr.read())!=-1){
			//4.使用FileWriter中写一个字符的方法,写入数据到内存缓冲区中
			fw.write(len);
			//5.把内存缓冲区中的数据,刷新到文件中
			fw.flush();
		}*/
		
		//3.使用数组进行缓冲读取数据
		char[] cs = new char[1024];
		int len = 0;//读取的有效长度
		while((len = fr.read(cs))!=-1){
			//使用FileWriter写入字符数组一部分的方法,写入数据到内存缓冲区中
			fw.write(cs, 0, len);
			//把内存缓冲区中的数据,刷新到文件中
			fw.flush();
		}
		
		//6.释放资源,关闭流
		fw.close();
		fr.close();
	}
}
