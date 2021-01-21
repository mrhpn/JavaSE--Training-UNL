package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileTest {
	public static void main(String[] args) throws IOException {
		String filePath = "C:\\myfile\\myfile.txt";
		fileReadWithBurffer(filePath);
		fileReaderTest(filePath);
		fileReadWithScanner(filePath);
	}
	
	public static void fileReaderTest(String filePath) throws IOException {
		File file = new File(filePath);
		
		FileReader fileReader = new FileReader(file);
		
		int x;
		
		while((x = fileReader.read()) != -1) {
			System.out.println((char)x);
		}
		
		fileReader.close();
	}

	public static void fileReadWithBurffer(String filePath) throws IOException {
		File file = new File(filePath);
		
		if (file.exists()) {
			System.out.println("File exists: " + file.getName());
			
			BufferedReader bufferReader = null;
			try {
				bufferReader = new BufferedReader(new FileReader(file));
				String line;
				
				while((line = bufferReader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				bufferReader.close();
				System.out.println("File reader closed");
			}
		} else {
			System.out.println("File not found.");
		}
	}
	
	public static void fileReadWithScanner(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		// read line by line
//		while(scanner.hasNext()) {
//			String line = scanner.nextLine();
//			System.out.println(line);
//		}
		
		scanner.useDelimiter("\\*");
		
		// read word by word
		while(scanner.hasNext()) {
			String line = scanner.next();
			System.out.println(line);
		}
	}
}
