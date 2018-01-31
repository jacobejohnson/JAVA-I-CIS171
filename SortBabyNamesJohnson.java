//Jacob Johnson
import java.util.Scanner;
import java.io.IOException;
import java.net.URL;
import java.io.PrintWriter;
public class SortBabyNamesJohnson {
	
	public static void main(String[] args) throws IOException {
		
			try {
			String address = "https://bbmedia.dmacc.edu/CIS/CIS171/babynames2014.txt";
			URL pageLocation = new URL(address); 
			Scanner in = new Scanner(pageLocation.openStream());
			
			PrintWriter outGirls = new PrintWriter("girls.txt");
			PrintWriter outBoys = new PrintWriter("boys.txt");
			while(in.hasNextLine()){ 
				String person = in.nextLine();
				if (person.contains("girl")) {
					outGirls.println(person);
				}else
					outBoys.println(person);
			}
			
			
			in.close();
			outGirls.close();
			outBoys.close();
			}catch (IOException e){
				System.out.println("This address cannot be found.");
			}
	}
}
