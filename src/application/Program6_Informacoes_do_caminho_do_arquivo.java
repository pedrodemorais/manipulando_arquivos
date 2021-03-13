package application;

import java.io.File;
import java.util.Scanner;

public class Program6_Informacoes_do_caminho_do_arquivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Caminho do Arquivo");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		System.out.println("getName: "+path.getName());//retorna somente o nome do arquivo
		System.out.println("getParent: "+path.getParent());//retorna o caminho do arquivo
		System.out.println("getPth: "+path.getPath());//retorna o caminho e o nome do arquivo
		
	}

}
