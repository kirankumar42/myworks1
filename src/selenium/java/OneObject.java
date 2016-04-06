package selenium.java;

public class OneObject {

	private static OneObject ref=new OneObject();
	private OneObject(){
		System.out.println("This is one constructor");
	}
	public void sample(){
		System.out.println("This is one object class");
	}
	public static OneObject getRef(){
		return ref;
	}
	public void showMessage(){
		System.out.println("Hellow tester");
	}
}
