/*
 
 2. 实现判断一个整数，属于哪介范围：大于0;小于0：等于O
 
*/
import java.util.Scanner;
public class Day3Homework2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number > 0) {
			System.out.println("这是正数");
		}else if(number == 0) {
			System.out.println("这是数字0");		
		}else {
			System.out.println("这是负数");
		}
	}
}
