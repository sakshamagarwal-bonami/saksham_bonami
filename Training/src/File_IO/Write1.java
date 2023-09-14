package File_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("Test1");
		f1.mkdir();
		File f2=new File(f1,"file1.txt");
		f2.createNewFile();
		FileWriter fw=new FileWriter(f2);
		fw.write(100);
		fw.write('\n');
		fw.write("hey!!");
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader(f2);
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
			}
		}

}
