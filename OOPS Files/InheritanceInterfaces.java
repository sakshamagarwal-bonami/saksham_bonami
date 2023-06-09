package temp;

interface SampleInterface{
	void method1();
	void method2();

}
interface ChildInterface extends SampleInterface{
	void method3();
	void method4();
}
class A implements ChildInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("M1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("M2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("M3");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("M4");
	}
	
}
public class InheritanceInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();
	}

}
