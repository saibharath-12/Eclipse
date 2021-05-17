
public class StaticBlock {
	int emid;
	int salary;
	static String ceo;
	void show() {
		System.out.println(emid+" "+salary+" "+ceo);
	}

	public static void main(String[] args) {
		StaticBlock sai = new StaticBlock();
		sai.emid =12;
		sai.salary = 20000;
		StaticBlock.ceo= "rajesh";
		StaticBlock uha = new StaticBlock();
		uha.emid=1;
		uha.salary = 40000;
		StaticBlock.ceo= "rajesh";
		sai.show();
		uha.show();

	}

}
