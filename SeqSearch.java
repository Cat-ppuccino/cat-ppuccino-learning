import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		String[] names = {"白", "金","紫", "青"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入要查找的名字");
		String findName = myScanner.next();
		int index = -1;
		for(int i = 0;i < names.length;i++) {
			if(findName.equals(names[i])) {
				System.out.println("找到了" + names[i]);
				System.out.println("它在第" + (i+1) + "个");
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("不好意思没有找到");
		}
	}
}