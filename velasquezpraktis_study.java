package velasquez_project;
import java.util.*;
public class velasquezpraktis_study {
	public static void main(String[] agrs) {
		Scanner velasquez = new Scanner(System.in);
		ArrayList<String> product = new ArrayList<>();
		ArrayList<Integer> quantities = new ArrayList<>();
		
		product.add("Keyboard");
		product.add("Mouse");
		product.add("Monitor");
		product.add("Printer");
		product.add("Headset");
		product.add("Webcam");
		
		quantities.add(15);
		quantities.add(4);
		quantities.add(8);
		quantities.add(3);
		quantities.add(12);
		quantities.add(5);
		
		System.out.println("PRODUCT INVENTORY REPORT");
		System.out.println("PRODUCT\t\tQUANTITY");
		for(int i = 0; i < product.size(); i++) {
			System.out.println(product.get(i) + "\t\t" + quantities.get(i));
		}
		
		int highest = 0;
		int lowest = 0;
		int lowCount = 0;
		
		for(int i = 0; i < quantities.size(); i++) {
			if(quantities.get(i) > quantities.get(highest)) {
				highest = i;
			}
			if(quantities.get(i) > quantities.get(lowest)) {
				lowest = i;
			}
			if(quantities.get(i) <= 5) {
				lowCount++;
			}
		}
		System.out.println("\nHighest Stock: " + product.get(highest) + "( " + quantities.get(highest) + ") ");
		System.out.println("\nLowest Stock: " + product.get(lowest) + "( " + quantities.get(lowest) + ") ");
		
		System.out.print("\nSearch product: ");
		String search = velasquez.nextLine();
		System.out.println("Search Result: ");
		for(int i = 0; i < product.size(); i++) {
			if(product.get(i).equalsIgnoreCase(search)) {
				System.out.println(product.get(i) + " - " + quantities.get(i) + " units");
			}	
		}
		System.out.println("Products With Low Stock (5 or below): " + lowCount);
		
		
		System.out.println("\nRemove product: ");
		String remove = velasquez.nextLine();
		for(int i = 0; i < product.size(); i++) {
			if(product.get(i).equalsIgnoreCase(remove)) {
				product.remove(i);
				quantities.remove(i);
				break;
			}
		}
		
		System.out.println("\nUPDATED INVENTORY ");
		for(int i = 0; i < product.size(); i++) {
			System.out.println(product.get(i) + "-" + quantities.get(i));
		}
		System.out.println("\nTotal Products: " + product.size());
		
		velasquez.close();
		
		
		
		
		
		
		
	}

}
