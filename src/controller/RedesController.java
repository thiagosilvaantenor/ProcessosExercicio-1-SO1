package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {

	private String os() {
		String soNome = System.getProperty("os.name");
		return soNome;
	}

	public void callProcess(String process) {
		try {
			Process getProcess = Runtime.getRuntime().exec(process);
		} catch (Exception e) {
			String errorMessage = e.getMessage();

			if (errorMessage.contains("740")) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd /c ");
				buffer.append(" ");
				buffer.append(process);
				try {
					Runtime.getRuntime().exec(buffer.toString());
				} catch (Exception e1) {
					System.err.println(e1.getMessage());
				}
			} else {
				e.printStackTrace();
			}
		}
	}

	public void ip() {
		/*
		 * Sistema Operacional e, de acordo com o S.O., faz a chamada de configuração de
		 * IP.
		 */

		String os = os();

		if (os.contains("Windows")) {
			try {
				Process p = Runtime.getRuntime().exec("ipconfig");
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String adaptador = "";
				while (linha != null) {
					if(linha.contains("Adaptador")) {
						adaptador = linha;
					}
					else if (linha.contains("IPv4")) {
						System.out.println(adaptador);
						System.out.println(linha);
					}
					linha = buffer.readLine();
				}

				fluxo.close();
				leitor.close();
				buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (os.contains("Linux")) {
			try {
				Process p = Runtime.getRuntime().exec("ipconfig");
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();

				while (linha != null) {
					System.out.println(linha);
					linha = buffer.readLine();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

		}

	}
}
