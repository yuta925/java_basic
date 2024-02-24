package 抽象クラスとポリモフィズム;

public class StuSample {

	public static void main(String[] args) {
		TandF taf = new TandF("陸上競技部");
		Football fb = new Football("サッカー部");

		Student stu1 = new Student("西岡", taf);
		stu1.display();
		stu1.practice();

		Student stu2 = new Student("鈴木", fb);
		stu2.display();
		stu2.practice();
	}

}
