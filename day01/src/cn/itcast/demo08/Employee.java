package cn.itcast.demo08;
/*
 * 定义父类员工类
 * 
 * 属性:姓名
 * 
 * 方法:工作方法
 * 
 */
public class Employee extends Object{
	String name;
	
	public void work(){
		System.out.println("呕心沥血的工作!"+name);
	}
}
