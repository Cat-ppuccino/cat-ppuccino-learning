//创建一个char类型的26个元素的数组，分别 放置'A'-'z‘。
//使用for循环来打印所有元素
public class ArrayHomework1{
	public static void main(String[] args) {
		char[] chars = new char[26];
		for(int i = 0;i < chars.length;i++) {
			chars[i] = (char)('A' + i);
		}
		for(int i = 0;i < chars.length;i++) {
			System.out.print(chars[i]);
		}
		
		System.out.println();
		
		int arr[] = {4, 23, 66, 01, 11};
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值为" + max + "下标为" + maxIndex);
	}
}