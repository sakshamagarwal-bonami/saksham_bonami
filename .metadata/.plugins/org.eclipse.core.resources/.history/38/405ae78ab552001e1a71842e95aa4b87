package MultiThreading;

public class Thread4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1=new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("Hello4");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("Hello5");
			Thread.sleep(500);
		}

	}

}
