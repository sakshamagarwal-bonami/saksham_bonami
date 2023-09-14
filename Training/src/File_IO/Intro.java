package File_IO;

import java.io.File;
import java.io.IOException;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		File a=new File("Bonami");
		a.mkdir();
		System.out.println(a.exists());
		try {
			a.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a.exists());
		File f1=new File("Bonami","new.txt");
		System.out.println(f1.exists());
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
