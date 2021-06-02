import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {

		Double totalConta;
		Double gorgeta;

		String NomeGarcom = JOptionPane.showInputDialog(null, "Entre com seu nome ", "Nome", JOptionPane.PLAIN_MESSAGE);
		Double valorConta = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor total da conta  ",
				"Pergunta", JOptionPane.PLAIN_MESSAGE));

		gorgeta = valorConta * (0.1);
		totalConta = gorgeta + valorConta;

		JOptionPane.showMessageDialog(null,
				NomeGarcom + " sua gorjeta recebida referente ao valor de 10% da conta total  é de R$ " + gorgeta
						+ " e o valor total da conta do cliente é R$ " + totalConta,
				" Resultado ", JOptionPane.PLAIN_MESSAGE);

	}

}
