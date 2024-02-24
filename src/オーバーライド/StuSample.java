package オーバーライド;

import 継承.Student;

public class StuSample {
	public static void main(String[] args) {
		Student stu = new Student();
		
		// スーパークラスのメソッド
		stu.setName("西岡");
		stu.display();
		
		// サブクラスのメソッド
		stu.setStuNo(1);
		stu.displayStuNo();
	}
}
