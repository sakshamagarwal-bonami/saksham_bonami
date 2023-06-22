package File_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("filder1");
		f1.mkdir();
		File f2=new File(f1,"t1.txt");
		f2.createNewFile();
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.write('a');
		bw.write("hello guys");
		char ch[]= {'a','b','c'};
		bw.newLine();
		bw.write(ch);
		bw.flush();
		bw.close();
		
		FileReader fr=new FileReader(f2);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
			
		}
		br.close();
		
	}

}
