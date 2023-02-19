package projectsGit;

import java.util.Locale;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double saldoInicial=150.0, saque, saldoDisponivel, deposito;	
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("CAIXA ELÊTRONICO \n"
				+ "1 - Depositar\n"
				+ "2 - Sacar\n"
				+ "3 - Sair\n"));
		
		switch(opcao) {
		case 1: deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Olá, você possui em sua conta: R$"+saldoInicial
										    +"\nQuanto você deseja depositar? "));
		saldoDisponivel = saldoInicial + deposito;
		JOptionPane.showMessageDialog(null,"Você depositou: R$"+deposito
											+ "\nSeu novo saldo é: R$"+saldoDisponivel);
		break;
		case 2: saque = Double.parseDouble(JOptionPane.showInputDialog(null,"Olá, você possui em sua conta: R$"+saldoInicial
										    +"\nQuanto você deseja sacar? "));
		if(saque > saldoInicial) {
			JOptionPane.showMessageDialog(null, "Você não possui o valor que deseja sacar!");
		} else {
			saldoDisponivel = saldoInicial - saque;
			JOptionPane.showMessageDialog(null,"Você sacou: R$"+saque
					+ "\nSeu novo saldo é: R$"+saldoDisponivel);
		}
		break;
		case 3:
			JOptionPane.showMessageDialog(null, "Agradecemos por utilizar nosso caixa elêtronico!");
		break;
		default: JOptionPane.showMessageDialog(null, "Agradecemos por utilizar nosso caixa elêtronico!");
		
		}
	}

}
