package view;

import controller.RedesController;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		RedesController redes = new RedesController();
		int opc = 0;
		while(opc != 3){
			opc = Integer.parseInt(JOptionPane.showInputDialog("Olá, digite o número indicado para o método deseja usar:\n1 - Método Ip\n2 - Método ping\n3 - Sair"));
			switch(opc) {
			case 1: JOptionPane.showMessageDialog(null, "Caso existam adaptadores e endereços IPv4, serão mostrados no terminal");
					redes.ip();
			break;
			case 2: JOptionPane.showMessageDialog(null, "A média do ping para o site: www.google.com.br será mostrado no terminal.\nDependendo da velocidade da conexão pode levar alguns segundos, por favor aguarde");
					redes.ping();
			break;
			case 3: JOptionPane.showMessageDialog(null,"Saindo ...");
			break;
			default: JOptionPane.showMessageDialog(null, "Opção invalida! Tente novamente!"); 
			}
		}
	}

}
