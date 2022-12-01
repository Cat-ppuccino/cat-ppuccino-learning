public class TestSwitchCase{
	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade) {
		case 'A' :
			System.out.println("优秀");
			break;
		case 'B' :
			System.out.println("良好");
			break;
		case 'C' :
			System.out.println("及格");
			break;
		case 'D' :
			System.out.println("不及格");
			break;
		default :
			System.out.println("未知等级");
		}
		System.out.println("等级是" + grade);
		
		
		int i = 1;
		switch(i) {
		case 0:
			System.out.println("0");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		}
		
		
	}
}