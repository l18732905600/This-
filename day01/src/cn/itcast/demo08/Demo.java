package cn.itcast.demo08;
/*
 * ��������̳и���֮��,�Ƿ�ӵ�и���ķ�˽�г�Ա
 * 
 * ����������������:��װ,�̳�,��̬
 * 
 * �̳еĺô�:
 * 	1.������ߴ���ĸ�����(�ظ�ʹ��)
 * 	2.Ϊ��̬�ṩ��ǰ��
 * 
 * ѡ����:ctrl+t-->�鿴�̳й�ϵ
 */
public class Demo {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		//�������ʹ�ø���̳й��������Ժͷ���
		t.name = "�����";
		t.work();
		t.show();
		//����ʹ���Լ��ķ���
		t.sleep();
		
		ZhuJiao zj = new ZhuJiao();
		zj.name = "����";
		zj.work();
	}
}