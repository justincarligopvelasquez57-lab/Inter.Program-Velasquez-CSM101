package velasquez;
import java.io.FileReader;
import java.io.IOException;
public class W3A2Velasquez {
	public static void main(String[] args) {
		try (FileReader reader = new FileReader("Carl Justin.txt")){
			int ch;
			
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
		}catch (IOException e) {
			System.out.print("Error reading file.");
		}
	}

}
