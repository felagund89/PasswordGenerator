/**
 * 
 */
package keyGen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import keyGen.util.Generatore;

/**
 * @author antonio
 *
 */
public class MainClass {

	
	
	
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		System.out.println("\t ===================================================");
		System.out.println("\t|                                                   |");
		System.out.println("\t|                    KEYGEN 1.0                     |");
		System.out.println("\t|                                                   |");
		System.out.println("\t|                                                   |");
		System.out.println("\t|                                            Snow89 |");
		System.out.println("\t ===================================================");
		
		File file = new File("src/keyGen/file/Dizionario.txt");
		
		
		Generatore generatore = new Generatore(file);
		
		System.out.println("\n\t\tLa password generata e' : "+generatore.getPassword().toLowerCase());
		
		
	}

}

