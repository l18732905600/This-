package cn.itcast.demo07;
/*
 * 组合关系:当一个类的成员变量包含其他类的时候,这两个类就是组合关系
 * 
 * 定义计算机类
 * 	属性:计算机名称,操作系统
 * 
 * Computer类中成员包含了OS类,Computer和OS就是组合关系
 * Computer类中成员包含了String类,Computer和String就是组合关系
 * 
 */
public class Computer {
	//计算机名称
	String name;
	//操作系统
	OS os;
}
