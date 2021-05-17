
public class StaticBlock2 {
	
	int emid;
	int salary;
	static String ceo;
	static {
		ceo = "priya";
	}
	public StaticBlock2(){
		emid = 1;
		salary = 90000;
	}
	public void show() {
		System.out.println(emid+" "+salary+" "+ceo);
	}

	public static void main(String[] args) {
		StaticBlock sai = new StaticBlock();
		
		StaticBlock uha = new StaticBlock();
		
		sai.show();
		uha.show();
	}
}
