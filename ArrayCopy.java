public class ArrayCopy{
	public static void main(String[] args) {
		int[] arr1 = {1, 2 , 3};
		//创建一个新的数组arr2，保证开辟新的数据空间
		int[] arr2 = new int[arr1.length];
		for(int i = 0;i < arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		arr2[0] = 100;
		System.out.println(arr1[0]);
	}
}