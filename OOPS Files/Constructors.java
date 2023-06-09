package temp;

class laptop{
	int ramSize;
	int storageSize;
	String brand;
	laptop(){
		this(2);
		System.out.println("Default constructor called");
//		ramSize=8;
		storageSize=512;
		brand="Dell";
	}
	laptop(int ramSize,int storageSize,String brand){
		this();
		System.out.println("Parameterised constructor called");
		this.ramSize=ramSize;
		this.storageSize=storageSize;
		this.brand=brand;
	}
	laptop(int ramSize){
		System.out.println("Parameterised constructor2 called");
		this.ramSize=ramSize;
	}
}

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop l1=new laptop();
		System.out.println(l1.ramSize);
		System.out.println(l1.storageSize);
		System.out.println(l1.brand);
		
		laptop l2=new laptop(16,1024,"HP");
		System.out.println(l2.ramSize);
		System.out.println(l2.storageSize);
		System.out.println(l2.brand);
	}

}
