package MultiThreading;
class Hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {
			Thread.sleep(1000);}
			catch(Exception e) {}
		}
	}
}
class Hello1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);}
				catch(Exception e) {}
		}
	}
}
public class Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj1=new Hi();
		Hello1 obj2=new Hello1();
		obj1.start();
		obj2.run();

	}

}
