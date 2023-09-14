
public class A implements Interface1,Interface2 {
	
	public static void main(String[] args) {
		A obj=new A();
		obj.show();
	}

	@Override
	public void show() {
		System.out.println("hiii");
	}

	@Override
	public String a() {
		return "";
	}
}