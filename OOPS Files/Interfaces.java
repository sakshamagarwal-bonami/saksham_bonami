package temp;

interface Bicycle{
	int a=56;
	void applyBrake(int decrement);
	void speedUp(int increment);
}
interface BlowSong{
	
	void playSong();
	void playMusic();
	default void add() {};
}

class HeroCycle implements Bicycle,BlowSong{
	void blowHorn() {
		System.out.println("Honkinggg!!");
	}
	public void applyBrake(int decrement) {
		System.out.println("Apply brake");
	}
	public void speedUp(int increment) {
		System.out.println("Speed Up"); 
	}
	@Override
	public void playSong() {
		// TODO Auto-generated method stub
		System.out.println("Playing Song");
	}
	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing Music");
		
		
	}
	public void add() {
		System.out.println("Default method");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroCycle c1=new HeroCycle();
		c1.blowHorn();
		c1.speedUp(5);
		c1.applyBrake(3);
		c1.playMusic();
		c1.playSong();
		System.out.println(c1.a);
		c1.add(); 
	}

}
