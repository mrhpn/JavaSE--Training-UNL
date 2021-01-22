package assignment_6_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Logger class used when exceptions log are recorded for later reference
 * 
 * Used concepts: 
 * -------------- 
 * - Encapsulation 
 * - Abstraction 
 * - Exception Handling
 * - File (I/O)
 * 
 * @author Htet Phyo Naing
 *
 */
public class Logger {
	
	private String message;
	private String logFilePath = "C:\\Java Training\\SE\\01_JavaSEBasics\\src\\assignment_6_1\\log.txt";
	
	public Logger(String message) {
		this.message = message;
	}
	
	public void log() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true));
			
			writer.append("\n");
			writer.append(message);
			writer.append("\n");
			writer.append("------------------------");
			
			writer.close();
		} catch (IOException e) {
			// if the system can't find the log file, assuming that the system is in bad stage, then exit the system with non-zero code.
			System.out.println("Try again later!");
			System.exit(1);
		}
	}
}
