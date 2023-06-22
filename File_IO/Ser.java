package File_IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student{
	public String name;
	public Integer age;
}
public class Ser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.name="Saksham";
		s1.age=22;
		File f=new File("Ser");
		f.mkdir();
		File f1=new File(f,"f.txt");
		FileOutputStream fout=new FileOutputStream(f1);
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.close();
	}

}
