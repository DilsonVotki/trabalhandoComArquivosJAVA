package aula182;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com um caminho de arquivo: ");
		String strPasta = sc.nextLine();
		
		File pasta = new File(strPasta);
		
		//pega o nome do arquivo da pasta indicado acima
		System.out.println("getName: " + pasta.getName());
		
		//pega somente o caminho do arquivo da pasta indicado acima
		System.out.println("getParent: " + pasta.getParent());
		
		//pega o caminho completo do arquivo da pasta indicado acima
		System.out.println("getPath: " + pasta.getPath());
				
		sc.close();
	}

}
