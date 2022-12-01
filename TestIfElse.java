public class TestIfElse{
	public static void main(String[] args) {
/*		int x = 10;
		if(x < 20) {
			System.out.println("这是if语句");
			
		}
*/
		int y = 1;
		if(y >= 20) {
			System.out.println("预算充足，可劲儿造。还剩：" + y);
		}else if(y > 0){
			System.out.println("已经不多了，要节约。只剩：" + y);
		}else {
			System.out.println("超预算了");
		}
		
		
		for(int i = 10;i > 0;i--) {
			if(i == 5) {
				System.out.println("数字对啦,现在是：" + i);
			}else if(i > 5){
				System.out.println("就差一点点了,现在是：" + i);
			}else {
				System.out.println("这是怎么回事？现在是：" + i);
			}
		}
	}
}