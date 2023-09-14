package File_IO;
import java.io.*;
public class Write3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("New file");
		f.mkdir();
		File f1=new File(f,"t2.txt");
		f1.createNewFile();
		FileWriter fw=new FileWriter(f1);
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);
		pw.write("100");
		pw.print("100");
		pw.println(false);
		pw.flush();
		pw.close();
		
	}

}
