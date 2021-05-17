package common;

public class Common1 {
	public void publicprint() {
		System.out.println("public");
	}
	protected void protctedprint() {
		System.out.println("protected");
	}
	 void defaultprint() {
		System.out.println("default");
	}
	private void privateprint() {
			System.out.println("private");
		}
	
	public static void main(String[] args) {
		Common1 obj = new Common1();
		obj.privateprint();
		obj.protctedprint();
		obj.publicprint();
		obj.defaultprint();
	}

}
