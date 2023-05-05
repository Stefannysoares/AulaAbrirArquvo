package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.iArquivosController;

public class Principal {

	public static void main(String[] args) {
		
		iArquivosController arqCont = new ArquivosController();
		
		String dirWin = "C:\\WINDOWS";
		String path = "C:\\TEMP\\Aula";
		String nome = "teste.txt";
		try {
			//arqCont.readDir(dirWin);
			//arqCont.createFile(path, nome);
			//arqCont.readFile(path, nome);
			arqCont.openFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
