import javax.swing.JOptionPane;

public class Trabalho2 {

	public class Cliente {
		int codigo_cliente = 0; // código do cliente
		String nome_cliente = null ; // nome do cliente
		int idade_cliente = 0; // quantos anos o cliente tem
		int ano_veiculo = 0; // O ano do carro em questão
		double valor_veiculo = 0; // valor do MODELO do veículo na tabela FIPE
	}

	static Cliente A[] = new Cliente[3]; // vetor do tipo Cliente

	public static void pegaDados(String[] cliente) {

		for (int i = 0; i < 4; i++) {
			A[i].codigo_cliente = Integer.parseInt(JOptionPane
					.showInputDialog(" Informe o código do cliente. "));
			A[i].nome_cliente = JOptionPane
					.showInputDialog(" Informe o nome. ");
			A[i].idade_cliente = Integer.parseInt(JOptionPane
					.showInputDialog(" Informe a idade. "));
			A[i].ano_veiculo = Integer.parseInt(JOptionPane
					.showInputDialog(" Informe o ano do veículo. "));
			A[i].valor_veiculo = Double.parseDouble(JOptionPane
					.showInputDialog(" Informe o valor do veículo. "));
		}
	}

	public static void main(String[] args) {

		int menu = Integer
				.parseInt(JOptionPane
						.showInputDialog("1) Solicitar dados de todos os Clientes e seus veículos.\n"
								+ "2) Mostrar nome e código de todos os clientes.\n"
								+ "3) Mostrar todos os dados de um determinado cliente solicitando seu código.\n"
								+ "4) Calcular o valor do Prêmio do seguro de um cliente solicitando seu código.\n"
								+ "5) Calcular o valor da franquia normal de cliente solicitando seu código.\n"
								+ "6) Calcular o valor da franquia reduzida de um cliente solicitando seu código.\n"
								+ "7) Calcular o valor do adicional para retrovisores e vidros de um cliente solicitando seu código.\n"
								+ "8) Calcular o valor total que o cliente deve pagar para a seguradora.\n"
								+ "9) Solicite o código de um cliente e calcule o valor que a seguradora deve pagar, caso haja um sinistro com perda total.\n"
								+ "10)Apresentar um resumo de cálculos de um determinado cliente solicitando seu código.\n"
								+ "11)Sair "));
		while (menu != 11) {
			switch (menu) {
			case 1:
				String[] cliente = null;
				pegaDados(cliente);
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			default:
				break;
			}
		}

	}
}
