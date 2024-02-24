package 抽象クラスとポリモフィズム;

public abstract class Club {
	public String name;

	public Club(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("部活 : " + name);
	}

	public abstract void practice();
}