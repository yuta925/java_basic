package オーバーライド;

public class Person {
	private String name;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.print("名前 : " + name);
	}
}
