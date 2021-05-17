import childpackage.ChildClass;
import parentpackage.ParentClass;

public class App {

	public static void main(String[] args) {
        System.out.println( "Hello World!" );
        
        ChildClass child = new ChildClass();
        child.show();
        
        ParentClass parent = new ChildClass();
        parent.show();
        ParentClass obj = new ParentClass();
        obj.show();
		

	}

}
