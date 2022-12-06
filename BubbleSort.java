public class BubbleSort{
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13};
		for(int j = arr.length - 1;j > 0;j--) {
			for(int i = 0;i < j;i++) {
				if(arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for(int k = 0;k < arr.length;k++) {
			System.out.print(arr[k] + "\t");
		}
	}
}