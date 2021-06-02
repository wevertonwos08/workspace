import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {

		Double SalarioFunc;

		String nomeFunc = JOptionPane.showInputDialog(null, "Entre com seu nome ", "Nome", JOptionPane.PLAIN_MESSAGE);

		int quantHoras = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite a quantidade de horas trabalhadas  ", "Pergunta", JOptionPane.PLAIN_MESSAGE));

		Double ValorDaHora = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Digite o valor da hora trabalhada   ", "Pergunta", JOptionPane.PLAIN_MESSAGE));

		SalarioFunc = quantHoras * ValorDaHora;

		JOptionPane.showMessageDialog(null, nomeFunc + " seu salario é  " + SalarioFunc,

				" Resultado ", JOptionPane.PLAIN_MESSAGE);

	}

}
