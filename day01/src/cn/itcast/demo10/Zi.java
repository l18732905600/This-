package cn.itcast.demo10;

public class Zi extends Fu{
	/*
	 * �����г����˺͸���һģһ��(���η�,����ֵ����,������,�����б�)�ķ���,��֮Ϊ��д�˸���ķ���
	 * ������д�Ƿ�����������֮���,��д��Override
	 */
	public void show(){
		System.out.println("Zi�����д�����show����");
	}
	
	/*
	 * ��һ�����г�����ͬ���ķ���,���ǲ����б���ͬ,��֮Ϊ��������
	 * ��д��Overload
	 */
	public void show(int a){
		System.out.println("Zi���Լ���show a����");
	}
}