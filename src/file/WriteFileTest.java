package file;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;

public class WriteFileTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
			printWriterTest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeFileWithFormatter() throws FileNotFoundException {
		Formatter formatter = new Formatter("C:\\myfile\\myfile1.txt");
		
		formatter.format("%s   %d \n", "My Kyaw", 30);
		formatter.format("%s   %d \n", "My Maw", 30);
		formatter.format("%s   %d \n", "My Thaw", 30);
		System.out.println("File created");
		formatter.close();
	}
	
	public static void wirteWithBurfferWritter() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\myfile\\myfile2.txt", true));
		
		writer.write("My Kyaw 0");
		writer.write("My Maw 1");
		
		writer.append("Mg Ba 2");
		
		System.out.println("Buffered file is created");
		
		writer.close();
	}
	
	public static void printWriterTest() throws IOException {
		FileWriter fileWriter = new FileWriter("C:\\myfile\\myfile3.txt");
		
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print("mg Gein 300\n");
		printWriter.print("mg Gein 500\n");
		printWriter.print("mg Gein 400\n");
		
		printWriter.close();
	}
}
