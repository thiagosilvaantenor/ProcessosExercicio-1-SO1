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

	public String ifconfigOrIpAddr() {
		String resultado;
		try {
			Process process = Runtime.getRuntime().exec("ifconfig");
		} catch (Exception e1) {

			try {
				Process process = Runtime.getRuntime().exec("ip addr");
			} catch (Exception e2) {
				System.err.println(e2.getMessage());
			}
			return resultado = "ip addr";
		}
		return resultado = "ifconfig";
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
					if (linha.contains("Adaptador")) {
						adaptador = linha;
					} else if (linha.contains("IPv4")) {
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
			String comando = ifconfigOrIpAddr();

			try {
				Process p = Runtime.getRuntime().exec(comando);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String adaptador = "";
				while (linha != null) {
					if (linha.contains("<")) {
						adaptador = linha;
					} else if (linha.contains("inet ")) {
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
		}
	}
}
