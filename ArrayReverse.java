public class ArrayReverse{
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 66};
		//for(int i = 0;i < arr.length / 2;i++) {
		//	int temp = arr[arr.length -1 - i];
		//	arr[arr.length -1 - i] = arr[i];
		//	arr[i] = temp;
		//}
		for(int i = 0; i < arr.length;i++) {
			System.out.println("第" + (i + 1) + "个元素为" + arr[i]);
		}
		System.out.print("arr2为\t");
		int[] arr2 = new int[arr.length];
		for(int i = 0;i < arr.length;i++) {
			arr2[i] = arr[arr.length -1 -i];
			System.out.print(arr2[i] + "\t");
		}
	}
}