public class Loop{
	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		
		//while循环
		while(x < 20) {
			System.out.println("x的值是" + x);
			x++;
			System.out.print("\n");
		}
		//do...while循环
		do {
			System.out.println("y的值是" + y);
			y++;
			System.out.print("\n");
		}while(y < 20);
		
		//for循环
		for(int i = 10;i < 20;i++) {
			System.out.println("i的值是" + i);
			System.out.print("\n");
		}
		for(x = 10;x <= 20;x++) {
			for(y = 10;x + y <= 100;y = y * 2) {
				System.out.println("当前值为" + (x + y));
			}
		}
	}
}