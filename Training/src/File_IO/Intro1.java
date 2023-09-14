package File_IO;

import java.io.File;
import java.io.IOException;

public class Intro1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("hello.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File a=new File("Demo");
		a.mkdir();
		File b=new File(a,"hi.txt");
		b.createNewFile();
		File all=new File("C:\\Users\\saksh\\eclipse-workspace\\Training");
		String arr[]=all.list();
		int count=0;
		for(String s1:arr) {
			count++;
			System.out.println(s1);
		}
		System.out.println(count);
	}

}
