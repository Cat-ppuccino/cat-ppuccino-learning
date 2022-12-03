public class PyramidTower{
	public static void main(String[] args) {
		int totalLevel = 20;
		for(int i = 1;i <= totalLevel;i++) {
			for(int k = 1;k <= totalLevel - i;k++) {
				System.out.print(" ");
			}
			for(int j = 1;j <= 2 * i - 1;j++) {
					System.out.print("*");	
			}
			System.out.println();
		}
	}
}