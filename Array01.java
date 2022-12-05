import java.util.Scanner;
public class Array01{
	public static void main(String[] args) {
		double[] hens = {3, 5, 1, 3.4, 2, 50, 8, 90};
		double totalWeight = 0;
		for(int i = 0;i < hens.length;i++) {
			System.out.println("第" + (i+1) + "个元素的值为" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("总体重为" + totalWeight + "平局体重为" + (totalWeight / hens.length));
		
		Scanner myScanner = new Scanner(System.in);
		double[] scores = new double[5];
		for(int i = 0;i < scores.length;i++) {
			System.out.println("请输入第" + (i+1) + "个元素的值");
			scores[i] = myScanner.nextDouble();
		}
		System.out.println("当前数组的情况如下");
		for(int i = 0;i < scores.length;i++) {
			System.out.println("第" + (i+1) + "个元素的值为" + scores[i]);
		}
		
		
	}
}