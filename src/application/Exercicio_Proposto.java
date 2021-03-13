package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio_Proposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Entre com o caminho do arquivo:");
		String strPath = sc.nextLine();
		
		File sourceFile = new File(strPath);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean sucess = new File(sourceFolderStr+"\\out").mkdir();
		
		String targetFileStr = sourceFolderStr+"\\out\\summary.csv";//caminho e nome do arquivo que será escrito no folder
		
		//try para ler o arquivo e para pegar os dados do arquivo
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String itemCsv = br.readLine();
			
			while(itemCsv!=null) {
				
				String[] filds = itemCsv.split(",");
				String name = filds[0];
				double price = Double.parseDouble(filds[1]);
				int quantity = Integer.parseInt(filds[2]);
				
				list.add(new Product(name, price, quantity));
				
				System.out.println(itemCsv);
				itemCsv = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for(Product product:list) {
					bw.write(product.getName()+","+String.format("%.2f", product.total()));
					bw.newLine();
					
				}
				System.out.println(targetFileStr + " CREATED!");
				
				
				
			}
			catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
				
			}
			
			
			
			
		}
		catch(IOException e){
			System.out.println("Error reading file: " + e.getMessage());
			
		}
		
		
		sc.close();

	}

}
