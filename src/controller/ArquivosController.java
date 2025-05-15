package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController {

	public ArquivosController() {
		super();
	}

	@Override
	public void readDir(String path) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File(path);
		if (dir.exists() && dir.isDirectory()) {
			System.out.println("Arquivo Encontrado");
		} else {
			throw new IOException("Diretório Inválido");
		}
	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		// TODO Auto-generated method stub
		File arq = new File(path, nome);
		if (arq.exists() && arq.isFile()) {
			InputStreamReader fluxo = new InputStreamReader(new FileInputStream(arq));
			BufferedReader leitor = new BufferedReader(fluxo);
			String linha = leitor.readLine();
			while (linha != null) {
				System.out.println(linha);
			}
			fluxo.close();
			leitor.close();
		} else {
			throw new IOException("Arquivo Inválido");
		}
	}
}
