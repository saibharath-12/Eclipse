
public class Constructor {
	String colour;
	String colour2;
	int height =12;
	
	Constructor(String colour,String thecolour2){
		this.colour=colour;
		colour2=thecolour2;
		
	}
	void print() {
		System.out.println("colour ="+ colour+" "+"colour2="+" "+colour2+" "+height);
	}
	
	
	

	public static void main(String[] args) {
		Constructor obj = new Constructor("black","white");
		obj.print();

	}

}
