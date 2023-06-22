package File_IO;
import java.io.*;
public class Task {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f=new File("Task IO");
		f.mkdir();
		File fo=new File(f,"Orignal.txt");
		fo.createNewFile();
		FileWriter fw=new FileWriter(fo);
		BufferedWriter bwo=new BufferedWriter(fw);
		
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Names");
		String name=reader.readLine();

		while(!name.equals("-1")) {
			bwo.write(name);
			bwo.newLine();
			name=reader.readLine();
			
		}
		System.out.println("Names Taken");
		

		bwo.close();
		
		File f1=new File(f,"First.txt");
		f1.createNewFile();
		FileWriter fw1=new FileWriter(f1);
		BufferedWriter bw1=new BufferedWriter(fw1);
		
		File f2=new File(f,"Last.txt");
		f2.createNewFile();
		FileWriter fw2=new FileWriter(f2);
		BufferedWriter bw2=new BufferedWriter(fw2);
//		System.out.println("Entered1");
		FileReader fr=new FileReader(fo);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine(); 
//		System.out.println("Entered2");
		if(line==null) {
//			System.out.println("Entered4");
		}
		while(line!=null) {
			String[] arr=line.split(" ");
//			System.out.println("Entered3");
			bw1.write(arr[0]);
			bw1.newLine();
			
			bw2.write(arr[1]);
			bw2.newLine();
			
			line=br.readLine();
		}
		
		fr.close();
		br.close();
		bw1.close();
		bw2.close();
	}

}
