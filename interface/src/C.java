
public class C implements A, B {

	@Override
	public void hello() {
		System.out.println("Hello world");

	}

	public static void main(String[] args) {
		C obj = new C();
		obj.hello();

	}

}
