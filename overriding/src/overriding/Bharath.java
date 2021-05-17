package overriding;

public class Bharath extends Sai {
	public void fast()
	{
		System.out.println("Bharath is running");
	}

	public static void main(String[] args) {
		Bharath obj = new Bharath();
		obj.fast();
		Sai obj1 = new Sai();
		obj1.fast();

	}

}
