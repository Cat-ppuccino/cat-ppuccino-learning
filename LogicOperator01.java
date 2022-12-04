public class LogicOperator01{
	public static void main(String[] args) {
		int age = 50;
		if(age > 20 && age < 90){
			System.out.println("OK100");
		}
		if(age > 20 & age < 80) {
			System.out.println("OK200");
		}
		int a = 4;
		int b = 9;
		if(a < 1 && ++b < 50) {
			System.out.println("OK300");
		}
		if(a < 1 & ++b < 50) {
			System.out.println("OK300");
		}
		System.out.println(b);
	}
}