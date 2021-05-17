package sai;

public class Test {
	int id;
	String name;
	Test(int id,String name){
		this.id = id;
		this.name =name;
	}
	void play() {
		System.out.println(id+" "+name);
	}
	{
		System.out.println("kl");
	}
	static {
		System.out.println("hai");
	}
	Test(){
		System.out.println("constructor a");
	}
	public static void main(String[] args) {
        Test obj = new Test(11,"sai");
        Test obj4 = new Test();
        Test obj1 = new Test(12,"bharath");
        //Test obj3 = new Test(13," sai bharath");
        //Test obj4 = new Test();
        obj.play();
        obj1.play();

	}

}
