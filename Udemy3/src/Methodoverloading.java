
public class Methodoverloading {
	 int add(int a,int b) {
		return a+b;
		
	}
	 double add(double a,double b,double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		Methodoverloading obj = new Methodoverloading();
		System.out.println(obj.add(12,30));
		System.out.println(obj.add(12,30,21));
		

	}

}
