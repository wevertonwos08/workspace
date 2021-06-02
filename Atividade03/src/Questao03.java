import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {

		Double nota1 = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Digite o primeiro Nota ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
		Double nota2 = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Digite o Segundo Nota ", "Pergunta", JOptionPane.PLAIN_MESSAGE));

		Double mediaNotas = (nota1 + nota2) / 2;

		JOptionPane.showMessageDialog(null, "A sua media é  " + mediaNotas, "Resultado", JOptionPane.PLAIN_MESSAGE);
		if (mediaNotas > 6) {

			JOptionPane.showMessageDialog(null, "Parabens vc foi aprovado ", "Resultado", JOptionPane.PLAIN_MESSAGE);

		} else {

			JOptionPane.showMessageDialog(null, "Infelismente vc não foi aprovado ,procure estudar mais  ",
					" Resultado", JOptionPane.PLAIN_MESSAGE);
		}

	}

}
