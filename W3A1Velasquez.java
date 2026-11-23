package velasquez;
import java.io.FileWriter;
import java.io.IOException;
public class W3A1Velasquez {
	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("Carl Justin.txt")){
			writer.write("Welcome to Java File Handling! ");
			System.out.println("Text Sucessfully written.");
		}catch (IOException e) {
			System.out.println("Error writing to file.");
		}
		
	}

}
