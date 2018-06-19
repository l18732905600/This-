package cn.itcast.demo06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * IO��:
 * 	I:input,����,��
 * 	O:output,���,д
 * 	��:������(�ַ�,�ֽ�)
 * 
 * �ַ���:
 * 	����:FileReader,�ַ�������
 * 	���:FileWriter,�ַ������
 * ������:	
 * 	����:BufferedReader,�ַ�����������:���췽���д����ַ�����������,���ַ���������������һ��������,����ַ���������Ч��
 * 	���:BufferedWriter,�ַ����������:���췽���д����ַ����������,���ַ��䴦����������һ��������,����ַ��������Ч��
 * 
 * ��Ա����:
 * 	FileWriter  д����: �ַ�,�ַ�����,�ַ���
 * 	BufferedWriter д����: �ַ�,�ַ�����,�ַ���,����
 * 	FileReader ������: �ַ�,�ַ�����
 * 	BufferedReader ������:�ַ�,�ַ�����,�ı���
 */
public class Demo01IO {
	public static void main(String[] args) throws IOException {
		copy_02();
	}

	/*
	 * ʹ��BufferedWriter+BufferedReader���еķ��������ı��ļ�
	 * BufferedWriter:д���� newLine()
	 * BufferedReader:һ�ζ�ȡһ�� readLine(),��������ֵ��String,��ȡ��null����
	 * readLine��������ȡ���з�,������д��ʱ����Ҫ�ֶ����ӻ��з�
	 */
	private static void copy_02() throws IOException {
		//1.����FileReader����,���Ұ�����Դ
		FileReader fr = new FileReader("a.txt");
		//2.����FileWriter����,���Ұ����ݵ�Ŀ�ĵ�
		FileWriter fw = new FileWriter("copy.txt");
		//3.�����ַ���������������,���췽���д���FileReader����,���FileReader��Ч��
		BufferedReader br = new BufferedReader(fr);
		//4.�����ַ��������������,���췽���д���FileWriter����,���FileWriter��Ч��
		BufferedWriter bw = new BufferedWriter(fw);
		//5.ʹ��BufferedReader�����ж�ȡһ�еķ���,��ȡ����
		String line;
		while((line = br.readLine())!=null){
			//����BufferedWriter��д�ַ����ķ���,������д�뵽�ڴ滺������
			bw.write(line);
			//д����
			bw.newLine();
			//����ˢ�·���
			bw.flush();
		}
		//6.�ͷ���Դ
		bw.close();
		br.close();
	}

	/*
	 * ʹ��FileWriter+FileReader�����ı��ļ�
	 * �ı��ļ�:ʹ�ü��±���,�ܿ������ļ�
	 */
	private static void copy_01() throws IOException {
		//1.����FileReader����,���Ұ�����Դ
		FileReader fr = new FileReader("a.txt");
		//2.����FileWriter����,���Ұ����ݵ�Ŀ�ĵ�
		FileWriter fw = new FileWriter("copy.txt");
		/*//3.ʹ��FileReader��һ�ζ�ȡһ���ַ�,��ȡ����
		int len = 0;//��ȡ�����ص��ַ�
		while((len = fr.read())!=-1){
			//4.ʹ��FileWriter��дһ���ַ��ķ���,д�����ݵ��ڴ滺������
			fw.write(len);
			//5.���ڴ滺�����е�����,ˢ�µ��ļ���
			fw.flush();
		}*/
		
		//3.ʹ��������л����ȡ����
		char[] cs = new char[1024];
		int len = 0;//��ȡ����Ч����
		while((len = fr.read(cs))!=-1){
			//ʹ��FileWriterд���ַ�����һ���ֵķ���,д�����ݵ��ڴ滺������
			fw.write(cs, 0, len);
			//���ڴ滺�����е�����,ˢ�µ��ļ���
			fw.flush();
		}
		
		//6.�ͷ���Դ,�ر���
		fw.close();
		fr.close();
	}
}