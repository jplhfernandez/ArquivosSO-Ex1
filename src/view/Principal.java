package view;

import java.io.IOException;
import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) throws IOException {
	    {
	        IArquivosController arq = new ArquivosController();
	        String dir = "C:/Users/JP/AppData/Local/Temp";
	        String nome = "generic_food.csv";
	        
	        arq.readDir(dir);
	        arq.readFile(dir, nome);
	    }
	}

}
