
public class CO {
	 String name;
	  int rollno;
	  String clg;
	 public CO(String name){
		//this.name = name;
		//rollno =12;
		//clg = "Gvp";
		this(name,142,"Gvp");
		System.out.println("c1");
		
	}
	 public CO(String name ,int rollno){
		//this.name = name;
		//this.rollno = rollno;
		//clg = "Gvpce";
		this(name,rollno,"gvpce");
		System.out.println("c2");
	}
public CO(String name,int rollno,String clg){
		this.name = name;
		this.rollno = rollno;
		this.clg = clg;
		System.out.println("c3");
		
	
		
	}
	
	 void print(){
		System.out.println(name+" "+rollno+" "+clg);
	}

	public static void main(String[] args) {
		CO obj1 = new CO("ravi");
		obj1.print();
		CO obj2 = new CO("sai",13);
		obj2.print();
		CO obj = new CO("uha",06,"Gvpceo");
		obj.print();

	}

}
