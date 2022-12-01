/*
11.30学习日报

学习时间：



学习内容：

1.Java对象-object
类-class

2.八种基本数据类型
整数型 byte short int long
浮点型 float double
字符型 char
布尔型 boolean.   (True / false) 默认false

int 取值范围 -2^31——2^31-1,即-2147483648——2147483647, 默认值为0

Java常量-在程序运行中不能、不会被修改用final声明

final int A = 1 常量一般命名为大写

3.变量
局部变量 实力变量

一个类可以包含三个类型的变量
局部变量-方法中定义的变量-方法执行后内存中销毁
成员变量-在类中定义，方法之外
类变量-static类型

4.访问控制修饰符
4.1 default 默认不写，同一包内可见，不使用任何修饰符 使用对象：类，接口，变量，方法

	String version = "151"
	boolean processOrder(){
		return true;
	}
4.2 private 同一类中可见  使用对象：变量，方法

	私有访问修饰符
	最严格的访问限制 方法 变量 构造方法 所属类访问

	public class Logger{
		private String format;
		public String getFormat(){
			return this.format;
		}
		public void setFormat(String format){
			this.format = format;
		}
	}

4.3 public 对所有类可见 使用对象：类，接口，变量，方法

	能被任何类访问
	main方法是必须设置成公有的 java解释器必须能运行

4.4protected 对同一包内的所有自类可见 使用对象 变量 方法

	两个点分析说明 
	1.子类基类在同一包中 变量 方法 构造器 能被同一包中的其他任何类访问
	2.子类与基类不在同一包中：子类中 继承而来的protected方法 不能访问基类实例中的protected方法
private & protected 不能修饰类


5.运算符
加减乘除 + - * /

% 取余数

6.三种循环
while
do...while至少执行一次
for循环
	循环执行的次数 执行前就确定了 语法格式
	for(初始化;布尔表达式;更新){
		//代码
	}
	
	
7.条件语句if else
if(){
 //代码
}else{
 //代码
}


if(){
 //代码
}else if{
 //代码
}else{
 //代码
}


8.switch case
语法格式
switch(表达式){
	case value;
		break; // 可选
	case value;
		break;
	default; //可选
}
变量类型 byte short char int String
注意加break跳出case，否则后面case全部执行并输出


9.方法
方法是代码语句的集合 一起执行一个功能
方法包含于类中 对象中
方法在程序中被创建 最常用的是被调用
System.out.println()
System是Java自带的一个系统类
out是标准输出对象
println()是一个方法

优点：
1.使程序变得简短而清晰
2.有利于程序代码的维护
3.提高开发效率
4.提高了代码的重用性

方法的命名规则：
1.第一个单词以小写字母为开头 后面单词大写开头 不使用链接符
addPrice
2.下划线 测试类 JUnit

方法定义：
修饰符 返回值类型 方法名(参数类型 参数名){
	方法体代码(也称为函数)
	return 返回值;
}

如 public void(就是没有返回值类型) main(String[] args){
	
}

*/