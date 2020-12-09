package aula185;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com a pasta de destino: ");
		String strPasta = sc.nextLine();
		
		File pasta = new File(strPasta);
		
		//lista as pastas da pasta informada acima
		File[] pastas = pasta.listFiles(File::isDirectory);
		
		System.out.println("Pastas:");
		for(File pastinha: pastas) {
			System.out.println(pastinha);
		}
		
		//Lista os arquivos da pasta informada acima
		File[] arquivos = pasta.listFiles(File::isFile);
		
		System.out.println("Arquivos:");
		for(File arq : arquivos) {
			System.out.println(arq);
		}
		
		//cria uma nova pasta a partir da pasta informada acima
		boolean sucesso = new File(strPasta + "\\subdir").mkdir();
		System.out.println("Pasta Criada com Sucesso: " + sucesso);
		
		sc.close();

	}

}
