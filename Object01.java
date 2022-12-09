public class Object01{
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 10;
		cat1.color = "white";
		System.out.println("第一只猫的信息是" + cat1.name + cat1.age + cat1.color);
	}
}

class Cat{
	String name;
	int age;
	String color;
	
}