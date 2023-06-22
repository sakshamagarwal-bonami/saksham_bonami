package Exception;

class MyException extends Exception{
MyException(String msg){
	super(msg);
	System.out.println("Custom");
}
//System.out.println("Custom");
}

public class Custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3;
		try {
			if(i<10) {
				throw new MyException("Message");
			}
		}
		catch(Exception e) {
			System.out.println("Info");
			System.out.println("Exception done");
			System.out.println(e);
		}

	}

}
