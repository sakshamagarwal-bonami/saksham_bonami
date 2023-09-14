package cov;

class Animal{
	long a=(long) 555;
	public Number lnum() {
		return a;
	}
}

class Dog extends Animal{
	@Override
	public Integer lnum() {
		return 5;
	}
}

public class Mainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog();
		long ans=obj.lnum();
		System.out.println(ans);
		
	}

}
