package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//jeito correto de ler arquivos

public class Program3_jeito_certo {
	public static void main(String[] args) {

//		String path= "c:\\temp\\pedro.txt";
		String path= "c:\\temp\\pedro.txt";
	
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
				
				
			}
		}
		catch(IOException e){
			System.out.println("Error: "+e.getMessage());
			
		}
		
	}


}
