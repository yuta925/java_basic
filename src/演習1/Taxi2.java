package 演習1;

public class Taxi2 extends Car2{
	private int price;
	
	public Taxi2(int no) {
		this(no, 0);
	}
	
	public Taxi2(int no, int price) {
		super(no);
		this.price = price;
	}

	public void start() {
		price = 420;
	}

	public void run() {
		price += 80;
	}

	public void display() {
		super.display();
		System.out.println("料金は" + price + "円です");
	}
}
