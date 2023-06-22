package MultiThreading;

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1=()->
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hi");
				try {
				Thread.sleep(500);}
				catch(Exception e) {}
			}
		};
		Thread t1=new Thread(obj1);
		t1.start();

	}

}
