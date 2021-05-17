package interface_example;

public class Test implements Bank, Bank1 {

	@Override
	public void rate() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.rate();

	}

}
