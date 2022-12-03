/*
 3.判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如：153 = 1*1*1 + 3*3*3+5*5*5

拓展，找出100-输入数字中所有的水仙花数
*/

import java.util.Scanner;
public class Day3Homework3{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		
		//int a = number / 100;
		//int b = number % 100 /10;
		//int c = number % 10;
		for(int n = 100;n <= number;n++) {
			if((n / 100) * (n / 100) * (n / 100) + (n % 100 / 10) * (n % 100 / 10) * (n % 100 / 10) + (n % 10) * (n % 10) * (n % 10) == n) {
				System.out.println(n);
			}
		}	
	}
}