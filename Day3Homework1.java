/*
1. 编程实现如下功能
某人有100,000元,每经过一次路口，需要交费;规则如下：
1）当现金>50000时,每次交5%
22) 当现金＜=50000时,每次交1000
编程计算该人可以经过多少次路口，要求：使用 while break方式完成
*/

public class Day3Homework1{
	public static void main(String[] args) {
		double money = 100000;
		int count = 0;
		while(true) {
			if(money > 50000) {
				money *= 0.95;
				count++;
			}else if(money > 1000) {
				money -= 1000;
				count++;
			}else {
				break;
			}
		}
		System.out.println("十万元可以过" + count + "次路口");
	}
}