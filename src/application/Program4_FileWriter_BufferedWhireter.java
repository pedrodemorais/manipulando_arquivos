package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4_FileWriter_BufferedWhireter {

	public static void main(String[] args) {
		String[] lines = new String [] {"Pedro", "Henrique", "de Morais"};
		String path = "c:\\temp\\nome.txt";//local onde será criado o arquivo
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {//para não recriar o arquivo e acrescentar informação nele basta
																		  //colocar true	
			for(String line:lines) {
				bw.write(line);//escrevendo no arquivo
				bw.newLine();//quebra de linha no arquivo
				
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
