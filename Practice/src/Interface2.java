
public interface Interface2 {
	String a();
	default void show() {
		System.out.println("Interface2");
	}
}
