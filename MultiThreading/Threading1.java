package MultiThreading;

class Hi1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {
			Thread.sleep(1000);}
			catch(Exception e) {}
		}
	}
}
class Hello2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);}
				catch(Exception e) {}
		}
	}
}
public class Threading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi1 obj1=new Hi1();
		Hello1 obj2=new Hello1();
//		obj1.start();
//		obj2.start();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.run();
	}

}
