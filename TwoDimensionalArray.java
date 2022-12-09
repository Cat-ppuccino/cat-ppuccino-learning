public class TwoDimensionalArray{
	public static void main(String[] args) {
		int[][] arr = {{11,22,33}, {001,002,003}, {123,456,789}};
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		int[][] arr1 = new int[2][3];
		arr1[1][2] = 8;
		for(int i = 0;i < arr1.length;i++) {
			for(int j = 0;j < arr1[i].length;j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		int arr2[][];
		arr2 = new int[4][5];
		
		int[][] arr3 = new int[3][];
		for(int i = 0;i < arr3.length;i++) {
			arr3[i] = new int[i + 1];
			for(int j = 0;j < arr3[i].length;j++) {
				arr3[i][j] = i + 1;
				//System.out.print(arr3[i][j] + "\t");
			}
			//System.out.println();
		}
		for(int i = 0;i < arr3.length;i++) {
			for(int j = 0;j < arr3[i].length;j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}