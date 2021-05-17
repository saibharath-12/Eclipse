
public class SatitcImport {
	{
		System.out.println("sai instance");	
	}
	{
		System.out.println("sai instance 2");
	}

	static {
		System.out.println("sai");
	}
	static {
		System.out.println("bharath");
	}
	SatitcImport(int a){
		System.out.println("cons A");
	}
	void main() {
		System.out.println("method");
	}
	public static void main(String[] args) {
		StaticImport obj=new StaticImport();
		obj.main();
		
	}

}
