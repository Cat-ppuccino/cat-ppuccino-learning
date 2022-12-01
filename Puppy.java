//展示如何访问实例变量和调用成员方法

public class Puppy {
	int puppyAge;
	public Puppy(String name) {
		System.out.println("小狗的名字是" + name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		System.out.println("小狗年龄" + puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) {
		Puppy yourPuppy = new Puppy("tommy");
		yourPuppy.setAge(5);
		yourPuppy.getAge();
		System.out.println("变量值" + yourPuppy.puppyAge);
	}
	
}