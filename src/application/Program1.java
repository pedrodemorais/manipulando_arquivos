package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = null;
		File file = new File("c:\\temp\\pedro.txt");
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				
			}
		}
		catch(IOException e) {
			System.out.println("Erro:"+ e.getMessage());
			
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
