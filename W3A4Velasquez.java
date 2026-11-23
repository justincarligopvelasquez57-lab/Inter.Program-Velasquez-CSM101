package velasquez;
import java.io.FileWriter;
import java.io.IOException;
public class W3A4Velasquez {
	public static void main(String[] args) {
		try (FileWriter	writer =
				new FileWriter("Velasquezp4.txt", true)){
			writer.write("\nToday I Learned FileWriter.");
			System.out.println("New text added.");
		}catch (IOException e) {
			System.out.println("Unable to update file.");
		}
	}

}
